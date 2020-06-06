package madison.sumologic.query.vpc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class VPCFlowLogEntry {
  @Getter @Setter String version;
  @Getter @Setter String accountId;
  @Getter @Setter  String interfaceId;
  @Getter @Setter  String srcIp;
  @Getter @Setter  String destIp;
  @Getter @Setter String srcPort;
  @Getter @Setter  String destPort;
  @Getter @Setter  String protocol;
  @Getter @Setter  String packets;
  @Getter @Setter  String bytes;
  @Getter @Setter  String startSample;
  @Getter @Setter  String endSample;
  @Getter @Setter  String action;
  @Getter @Setter  String status;
}
