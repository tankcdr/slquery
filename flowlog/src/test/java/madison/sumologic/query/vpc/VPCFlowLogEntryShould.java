package madison.sumologic.query.vpc;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VPCFlowLogEntryShould {
  private final static String version = "2";
  private final static String accountId = "001";
  private final static String  interfaceId = "eni-123";
  private final static String  srcIp = "127.0.0.1";
  private final static String  destIp = "153.12.65";
  private final static String  srcPort = "23";
  private final static String  destPort = "22";
  private final static String  protocol= "6";
  private final static String  packets = "70";
  private final static String  bytes = "40";
  private final static String  startSample = "41523334";
  private final static String  endSample  = "41523355";
  private final static String  action = "ACCEPT";
  private final static String  status = "1";

  @Test
  void testDefaultConstructor() {
    VPCFlowLogEntry entry = new VPCFlowLogEntry();
    assertThat(entry, is(notNullValue()));
  }

  @Test
  void testDefaultConstructorWithSetterGetter() {
    VPCFlowLogEntry entry = new VPCFlowLogEntry();
    entry.setVersion(version);
    assertEquals(entry.getVersion(), version);
  }

  @Test
  void testDefaultConstructorAndAllSettersGetters() {
    VPCFlowLogEntry entry = new VPCFlowLogEntry();
    setEntryValues(entry);
    assetEqualAllTestValues(entry);
  }

  @Test
  void testAllArgsConstructor() {
    VPCFlowLogEntry entry = new VPCFlowLogEntry(
      version, accountId, interfaceId, srcIp, destIp, srcPort, destPort,
      protocol, packets, bytes, startSample, endSample, action, status
    );
    assetEqualAllTestValues(entry);
  }

  private void setEntryValues(VPCFlowLogEntry entry) {
    entry.setVersion(version);
    entry.setAccountId(accountId);
    entry.setInterfaceId(interfaceId);
    entry.setSrcIp(srcIp);
    entry.setDestIp(destIp);
    entry.setSrcPort(srcPort);
    entry.setDestPort(destPort);
    entry.setProtocol(protocol);
    entry.setPackets(packets);
    entry.setBytes(bytes);
    entry.setStartSample(startSample);
    entry.setEndSample(endSample);
    entry.setAction(action);
    entry.setStatus(status);
  }

  private void assetEqualAllTestValues(VPCFlowLogEntry  entry) {
    assertEquals(entry.getVersion(), version);
    assertEquals(entry.getAccountId(), accountId);
    assertEquals(entry.getInterfaceId(), interfaceId);
    assertEquals(entry.getSrcIp(), srcIp);
    assertEquals(entry.getDestIp(), destIp);
    assertEquals(entry.getSrcPort(), srcPort);
    assertEquals(entry.getDestPort(), destPort);
    assertEquals(entry.getProtocol(), protocol);
    assertEquals(entry.getPackets(), packets);
    assertEquals(entry.getBytes(), bytes);
    assertEquals(entry.getStartSample(), startSample);
    assertEquals(entry.getEndSample(), endSample);
    assertEquals(entry.getAction(), action);
    assertEquals(entry.getStatus(), status);
  }
}
