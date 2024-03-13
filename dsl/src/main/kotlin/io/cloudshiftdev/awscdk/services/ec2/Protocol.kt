package io.cloudshiftdev.awscdk.services.ec2

public enum class Protocol(
  private val cdkObject: software.amazon.awscdk.services.ec2.Protocol,
) {
  ALL(software.amazon.awscdk.services.ec2.Protocol.ALL),
  HOPOPT(software.amazon.awscdk.services.ec2.Protocol.HOPOPT),
  ICMP(software.amazon.awscdk.services.ec2.Protocol.ICMP),
  IGMP(software.amazon.awscdk.services.ec2.Protocol.IGMP),
  GGP(software.amazon.awscdk.services.ec2.Protocol.GGP),
  IPV4(software.amazon.awscdk.services.ec2.Protocol.IPV4),
  ST(software.amazon.awscdk.services.ec2.Protocol.ST),
  TCP(software.amazon.awscdk.services.ec2.Protocol.TCP),
  CBT(software.amazon.awscdk.services.ec2.Protocol.CBT),
  EGP(software.amazon.awscdk.services.ec2.Protocol.EGP),
  IGP(software.amazon.awscdk.services.ec2.Protocol.IGP),
  BBN_RCC_MON(software.amazon.awscdk.services.ec2.Protocol.BBN_RCC_MON),
  NVP_II(software.amazon.awscdk.services.ec2.Protocol.NVP_II),
  PUP(software.amazon.awscdk.services.ec2.Protocol.PUP),
  EMCON(software.amazon.awscdk.services.ec2.Protocol.EMCON),
  XNET(software.amazon.awscdk.services.ec2.Protocol.XNET),
  CHAOS(software.amazon.awscdk.services.ec2.Protocol.CHAOS),
  UDP(software.amazon.awscdk.services.ec2.Protocol.UDP),
  MUX(software.amazon.awscdk.services.ec2.Protocol.MUX),
  DCN_MEAS(software.amazon.awscdk.services.ec2.Protocol.DCN_MEAS),
  HMP(software.amazon.awscdk.services.ec2.Protocol.HMP),
  PRM(software.amazon.awscdk.services.ec2.Protocol.PRM),
  XNS_IDP(software.amazon.awscdk.services.ec2.Protocol.XNS_IDP),
  TRUNK_1(software.amazon.awscdk.services.ec2.Protocol.TRUNK_1),
  TRUNK_2(software.amazon.awscdk.services.ec2.Protocol.TRUNK_2),
  LEAF_1(software.amazon.awscdk.services.ec2.Protocol.LEAF_1),
  LEAF_2(software.amazon.awscdk.services.ec2.Protocol.LEAF_2),
  RDP(software.amazon.awscdk.services.ec2.Protocol.RDP),
  IRTP(software.amazon.awscdk.services.ec2.Protocol.IRTP),
  ISO_TP4(software.amazon.awscdk.services.ec2.Protocol.ISO_TP4),
  NETBLT(software.amazon.awscdk.services.ec2.Protocol.NETBLT),
  MFE_NSP(software.amazon.awscdk.services.ec2.Protocol.MFE_NSP),
  MERIT_INP(software.amazon.awscdk.services.ec2.Protocol.MERIT_INP),
  DCCP(software.amazon.awscdk.services.ec2.Protocol.DCCP),
  THREEPC(software.amazon.awscdk.services.ec2.Protocol.THREEPC),
  IDPR(software.amazon.awscdk.services.ec2.Protocol.IDPR),
  XTP(software.amazon.awscdk.services.ec2.Protocol.XTP),
  DDP(software.amazon.awscdk.services.ec2.Protocol.DDP),
  IDPR_CMTP(software.amazon.awscdk.services.ec2.Protocol.IDPR_CMTP),
  TPPLUSPLUS(software.amazon.awscdk.services.ec2.Protocol.TPPLUSPLUS),
  IL(software.amazon.awscdk.services.ec2.Protocol.IL),
  IPV6(software.amazon.awscdk.services.ec2.Protocol.IPV6),
  SDRP(software.amazon.awscdk.services.ec2.Protocol.SDRP),
  IPV6_ROUTE(software.amazon.awscdk.services.ec2.Protocol.IPV6_ROUTE),
  IPV6_FRAG(software.amazon.awscdk.services.ec2.Protocol.IPV6_FRAG),
  IDRP(software.amazon.awscdk.services.ec2.Protocol.IDRP),
  RSVP(software.amazon.awscdk.services.ec2.Protocol.RSVP),
  GRE(software.amazon.awscdk.services.ec2.Protocol.GRE),
  DSR(software.amazon.awscdk.services.ec2.Protocol.DSR),
  BNA(software.amazon.awscdk.services.ec2.Protocol.BNA),
  ESP(software.amazon.awscdk.services.ec2.Protocol.ESP),
  AH(software.amazon.awscdk.services.ec2.Protocol.AH),
  I_NLSP(software.amazon.awscdk.services.ec2.Protocol.I_NLSP),
  SWIPE(software.amazon.awscdk.services.ec2.Protocol.SWIPE),
  NARP(software.amazon.awscdk.services.ec2.Protocol.NARP),
  MOBILE(software.amazon.awscdk.services.ec2.Protocol.MOBILE),
  TLSP(software.amazon.awscdk.services.ec2.Protocol.TLSP),
  SKIP(software.amazon.awscdk.services.ec2.Protocol.SKIP),
  ICMPV6(software.amazon.awscdk.services.ec2.Protocol.ICMPV6),
  IPV6_NONXT(software.amazon.awscdk.services.ec2.Protocol.IPV6_NONXT),
  IPV6_OPTS(software.amazon.awscdk.services.ec2.Protocol.IPV6_OPTS),
  CFTP(software.amazon.awscdk.services.ec2.Protocol.CFTP),
  ANY_LOCAL(software.amazon.awscdk.services.ec2.Protocol.ANY_LOCAL),
  SAT_EXPAK(software.amazon.awscdk.services.ec2.Protocol.SAT_EXPAK),
  KRYPTOLAN(software.amazon.awscdk.services.ec2.Protocol.KRYPTOLAN),
  RVD(software.amazon.awscdk.services.ec2.Protocol.RVD),
  IPPC(software.amazon.awscdk.services.ec2.Protocol.IPPC),
  ANY_DFS(software.amazon.awscdk.services.ec2.Protocol.ANY_DFS),
  SAT_MON(software.amazon.awscdk.services.ec2.Protocol.SAT_MON),
  VISA(software.amazon.awscdk.services.ec2.Protocol.VISA),
  IPCV(software.amazon.awscdk.services.ec2.Protocol.IPCV),
  CPNX(software.amazon.awscdk.services.ec2.Protocol.CPNX),
  CPHB(software.amazon.awscdk.services.ec2.Protocol.CPHB),
  WSN(software.amazon.awscdk.services.ec2.Protocol.WSN),
  PVP(software.amazon.awscdk.services.ec2.Protocol.PVP),
  BR_SAT_MON(software.amazon.awscdk.services.ec2.Protocol.BR_SAT_MON),
  SUN_ND(software.amazon.awscdk.services.ec2.Protocol.SUN_ND),
  WB_MON(software.amazon.awscdk.services.ec2.Protocol.WB_MON),
  WB_EXPAK(software.amazon.awscdk.services.ec2.Protocol.WB_EXPAK),
  ISO_IP(software.amazon.awscdk.services.ec2.Protocol.ISO_IP),
  VMTP(software.amazon.awscdk.services.ec2.Protocol.VMTP),
  SECURE_VMTP(software.amazon.awscdk.services.ec2.Protocol.SECURE_VMTP),
  VINES(software.amazon.awscdk.services.ec2.Protocol.VINES),
  TTP(software.amazon.awscdk.services.ec2.Protocol.TTP),
  IPTM(software.amazon.awscdk.services.ec2.Protocol.IPTM),
  NSFNET_IGP(software.amazon.awscdk.services.ec2.Protocol.NSFNET_IGP),
  DGP(software.amazon.awscdk.services.ec2.Protocol.DGP),
  TCF(software.amazon.awscdk.services.ec2.Protocol.TCF),
  EIGRP(software.amazon.awscdk.services.ec2.Protocol.EIGRP),
  OSPFIGP(software.amazon.awscdk.services.ec2.Protocol.OSPFIGP),
  SPRITE_RPC(software.amazon.awscdk.services.ec2.Protocol.SPRITE_RPC),
  LARP(software.amazon.awscdk.services.ec2.Protocol.LARP),
  MTP(software.amazon.awscdk.services.ec2.Protocol.MTP),
  AX_25(software.amazon.awscdk.services.ec2.Protocol.AX_25),
  IPIP(software.amazon.awscdk.services.ec2.Protocol.IPIP),
  MICP(software.amazon.awscdk.services.ec2.Protocol.MICP),
  SCC_SP(software.amazon.awscdk.services.ec2.Protocol.SCC_SP),
  ETHERIP(software.amazon.awscdk.services.ec2.Protocol.ETHERIP),
  ENCAP(software.amazon.awscdk.services.ec2.Protocol.ENCAP),
  ANY_ENC(software.amazon.awscdk.services.ec2.Protocol.ANY_ENC),
  GMTP(software.amazon.awscdk.services.ec2.Protocol.GMTP),
  IFMP(software.amazon.awscdk.services.ec2.Protocol.IFMP),
  PNNI(software.amazon.awscdk.services.ec2.Protocol.PNNI),
  PIM(software.amazon.awscdk.services.ec2.Protocol.PIM),
  ARIS(software.amazon.awscdk.services.ec2.Protocol.ARIS),
  SCPS(software.amazon.awscdk.services.ec2.Protocol.SCPS),
  QNX(software.amazon.awscdk.services.ec2.Protocol.QNX),
  A_N(software.amazon.awscdk.services.ec2.Protocol.A_N),
  IPCOMP(software.amazon.awscdk.services.ec2.Protocol.IPCOMP),
  SNP(software.amazon.awscdk.services.ec2.Protocol.SNP),
  COMPAQ_PEER(software.amazon.awscdk.services.ec2.Protocol.COMPAQ_PEER),
  IPX_IN_IP(software.amazon.awscdk.services.ec2.Protocol.IPX_IN_IP),
  VRRP(software.amazon.awscdk.services.ec2.Protocol.VRRP),
  PGM(software.amazon.awscdk.services.ec2.Protocol.PGM),
  ANY_0_HOP(software.amazon.awscdk.services.ec2.Protocol.ANY_0_HOP),
  L2_T_P(software.amazon.awscdk.services.ec2.Protocol.L2_T_P),
  DDX(software.amazon.awscdk.services.ec2.Protocol.DDX),
  IATP(software.amazon.awscdk.services.ec2.Protocol.IATP),
  STP(software.amazon.awscdk.services.ec2.Protocol.STP),
  SRP(software.amazon.awscdk.services.ec2.Protocol.SRP),
  UTI(software.amazon.awscdk.services.ec2.Protocol.UTI),
  SMP(software.amazon.awscdk.services.ec2.Protocol.SMP),
  SM(software.amazon.awscdk.services.ec2.Protocol.SM),
  PTP(software.amazon.awscdk.services.ec2.Protocol.PTP),
  ISIS_IPV4(software.amazon.awscdk.services.ec2.Protocol.ISIS_IPV4),
  FIRE(software.amazon.awscdk.services.ec2.Protocol.FIRE),
  CRTP(software.amazon.awscdk.services.ec2.Protocol.CRTP),
  CRUDP(software.amazon.awscdk.services.ec2.Protocol.CRUDP),
  SSCOPMCE(software.amazon.awscdk.services.ec2.Protocol.SSCOPMCE),
  IPLT(software.amazon.awscdk.services.ec2.Protocol.IPLT),
  SPS(software.amazon.awscdk.services.ec2.Protocol.SPS),
  PIPE(software.amazon.awscdk.services.ec2.Protocol.PIPE),
  SCTP(software.amazon.awscdk.services.ec2.Protocol.SCTP),
  FC(software.amazon.awscdk.services.ec2.Protocol.FC),
  RSVP_E2E_IGNORE(software.amazon.awscdk.services.ec2.Protocol.RSVP_E2E_IGNORE),
  MOBILITY_HEADER(software.amazon.awscdk.services.ec2.Protocol.MOBILITY_HEADER),
  UDPLITE(software.amazon.awscdk.services.ec2.Protocol.UDPLITE),
  MPLS_IN_IP(software.amazon.awscdk.services.ec2.Protocol.MPLS_IN_IP),
  MANET(software.amazon.awscdk.services.ec2.Protocol.MANET),
  HIP(software.amazon.awscdk.services.ec2.Protocol.HIP),
  SHIM6(software.amazon.awscdk.services.ec2.Protocol.SHIM6),
  WESP(software.amazon.awscdk.services.ec2.Protocol.WESP),
  ROHC(software.amazon.awscdk.services.ec2.Protocol.ROHC),
  ETHERNET(software.amazon.awscdk.services.ec2.Protocol.ETHERNET),
  EXPERIMENT_1(software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_1),
  EXPERIMENT_2(software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_2),
  RESERVED(software.amazon.awscdk.services.ec2.Protocol.RESERVED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Protocol): Protocol = when
        (cdkObject) {
      software.amazon.awscdk.services.ec2.Protocol.ALL -> Protocol.ALL
      software.amazon.awscdk.services.ec2.Protocol.HOPOPT -> Protocol.HOPOPT
      software.amazon.awscdk.services.ec2.Protocol.ICMP -> Protocol.ICMP
      software.amazon.awscdk.services.ec2.Protocol.IGMP -> Protocol.IGMP
      software.amazon.awscdk.services.ec2.Protocol.GGP -> Protocol.GGP
      software.amazon.awscdk.services.ec2.Protocol.IPV4 -> Protocol.IPV4
      software.amazon.awscdk.services.ec2.Protocol.ST -> Protocol.ST
      software.amazon.awscdk.services.ec2.Protocol.TCP -> Protocol.TCP
      software.amazon.awscdk.services.ec2.Protocol.CBT -> Protocol.CBT
      software.amazon.awscdk.services.ec2.Protocol.EGP -> Protocol.EGP
      software.amazon.awscdk.services.ec2.Protocol.IGP -> Protocol.IGP
      software.amazon.awscdk.services.ec2.Protocol.BBN_RCC_MON -> Protocol.BBN_RCC_MON
      software.amazon.awscdk.services.ec2.Protocol.NVP_II -> Protocol.NVP_II
      software.amazon.awscdk.services.ec2.Protocol.PUP -> Protocol.PUP
      software.amazon.awscdk.services.ec2.Protocol.EMCON -> Protocol.EMCON
      software.amazon.awscdk.services.ec2.Protocol.XNET -> Protocol.XNET
      software.amazon.awscdk.services.ec2.Protocol.CHAOS -> Protocol.CHAOS
      software.amazon.awscdk.services.ec2.Protocol.UDP -> Protocol.UDP
      software.amazon.awscdk.services.ec2.Protocol.MUX -> Protocol.MUX
      software.amazon.awscdk.services.ec2.Protocol.DCN_MEAS -> Protocol.DCN_MEAS
      software.amazon.awscdk.services.ec2.Protocol.HMP -> Protocol.HMP
      software.amazon.awscdk.services.ec2.Protocol.PRM -> Protocol.PRM
      software.amazon.awscdk.services.ec2.Protocol.XNS_IDP -> Protocol.XNS_IDP
      software.amazon.awscdk.services.ec2.Protocol.TRUNK_1 -> Protocol.TRUNK_1
      software.amazon.awscdk.services.ec2.Protocol.TRUNK_2 -> Protocol.TRUNK_2
      software.amazon.awscdk.services.ec2.Protocol.LEAF_1 -> Protocol.LEAF_1
      software.amazon.awscdk.services.ec2.Protocol.LEAF_2 -> Protocol.LEAF_2
      software.amazon.awscdk.services.ec2.Protocol.RDP -> Protocol.RDP
      software.amazon.awscdk.services.ec2.Protocol.IRTP -> Protocol.IRTP
      software.amazon.awscdk.services.ec2.Protocol.ISO_TP4 -> Protocol.ISO_TP4
      software.amazon.awscdk.services.ec2.Protocol.NETBLT -> Protocol.NETBLT
      software.amazon.awscdk.services.ec2.Protocol.MFE_NSP -> Protocol.MFE_NSP
      software.amazon.awscdk.services.ec2.Protocol.MERIT_INP -> Protocol.MERIT_INP
      software.amazon.awscdk.services.ec2.Protocol.DCCP -> Protocol.DCCP
      software.amazon.awscdk.services.ec2.Protocol.THREEPC -> Protocol.THREEPC
      software.amazon.awscdk.services.ec2.Protocol.IDPR -> Protocol.IDPR
      software.amazon.awscdk.services.ec2.Protocol.XTP -> Protocol.XTP
      software.amazon.awscdk.services.ec2.Protocol.DDP -> Protocol.DDP
      software.amazon.awscdk.services.ec2.Protocol.IDPR_CMTP -> Protocol.IDPR_CMTP
      software.amazon.awscdk.services.ec2.Protocol.TPPLUSPLUS -> Protocol.TPPLUSPLUS
      software.amazon.awscdk.services.ec2.Protocol.IL -> Protocol.IL
      software.amazon.awscdk.services.ec2.Protocol.IPV6 -> Protocol.IPV6
      software.amazon.awscdk.services.ec2.Protocol.SDRP -> Protocol.SDRP
      software.amazon.awscdk.services.ec2.Protocol.IPV6_ROUTE -> Protocol.IPV6_ROUTE
      software.amazon.awscdk.services.ec2.Protocol.IPV6_FRAG -> Protocol.IPV6_FRAG
      software.amazon.awscdk.services.ec2.Protocol.IDRP -> Protocol.IDRP
      software.amazon.awscdk.services.ec2.Protocol.RSVP -> Protocol.RSVP
      software.amazon.awscdk.services.ec2.Protocol.GRE -> Protocol.GRE
      software.amazon.awscdk.services.ec2.Protocol.DSR -> Protocol.DSR
      software.amazon.awscdk.services.ec2.Protocol.BNA -> Protocol.BNA
      software.amazon.awscdk.services.ec2.Protocol.ESP -> Protocol.ESP
      software.amazon.awscdk.services.ec2.Protocol.AH -> Protocol.AH
      software.amazon.awscdk.services.ec2.Protocol.I_NLSP -> Protocol.I_NLSP
      software.amazon.awscdk.services.ec2.Protocol.SWIPE -> Protocol.SWIPE
      software.amazon.awscdk.services.ec2.Protocol.NARP -> Protocol.NARP
      software.amazon.awscdk.services.ec2.Protocol.MOBILE -> Protocol.MOBILE
      software.amazon.awscdk.services.ec2.Protocol.TLSP -> Protocol.TLSP
      software.amazon.awscdk.services.ec2.Protocol.SKIP -> Protocol.SKIP
      software.amazon.awscdk.services.ec2.Protocol.ICMPV6 -> Protocol.ICMPV6
      software.amazon.awscdk.services.ec2.Protocol.IPV6_NONXT -> Protocol.IPV6_NONXT
      software.amazon.awscdk.services.ec2.Protocol.IPV6_OPTS -> Protocol.IPV6_OPTS
      software.amazon.awscdk.services.ec2.Protocol.CFTP -> Protocol.CFTP
      software.amazon.awscdk.services.ec2.Protocol.ANY_LOCAL -> Protocol.ANY_LOCAL
      software.amazon.awscdk.services.ec2.Protocol.SAT_EXPAK -> Protocol.SAT_EXPAK
      software.amazon.awscdk.services.ec2.Protocol.KRYPTOLAN -> Protocol.KRYPTOLAN
      software.amazon.awscdk.services.ec2.Protocol.RVD -> Protocol.RVD
      software.amazon.awscdk.services.ec2.Protocol.IPPC -> Protocol.IPPC
      software.amazon.awscdk.services.ec2.Protocol.ANY_DFS -> Protocol.ANY_DFS
      software.amazon.awscdk.services.ec2.Protocol.SAT_MON -> Protocol.SAT_MON
      software.amazon.awscdk.services.ec2.Protocol.VISA -> Protocol.VISA
      software.amazon.awscdk.services.ec2.Protocol.IPCV -> Protocol.IPCV
      software.amazon.awscdk.services.ec2.Protocol.CPNX -> Protocol.CPNX
      software.amazon.awscdk.services.ec2.Protocol.CPHB -> Protocol.CPHB
      software.amazon.awscdk.services.ec2.Protocol.WSN -> Protocol.WSN
      software.amazon.awscdk.services.ec2.Protocol.PVP -> Protocol.PVP
      software.amazon.awscdk.services.ec2.Protocol.BR_SAT_MON -> Protocol.BR_SAT_MON
      software.amazon.awscdk.services.ec2.Protocol.SUN_ND -> Protocol.SUN_ND
      software.amazon.awscdk.services.ec2.Protocol.WB_MON -> Protocol.WB_MON
      software.amazon.awscdk.services.ec2.Protocol.WB_EXPAK -> Protocol.WB_EXPAK
      software.amazon.awscdk.services.ec2.Protocol.ISO_IP -> Protocol.ISO_IP
      software.amazon.awscdk.services.ec2.Protocol.VMTP -> Protocol.VMTP
      software.amazon.awscdk.services.ec2.Protocol.SECURE_VMTP -> Protocol.SECURE_VMTP
      software.amazon.awscdk.services.ec2.Protocol.VINES -> Protocol.VINES
      software.amazon.awscdk.services.ec2.Protocol.TTP -> Protocol.TTP
      software.amazon.awscdk.services.ec2.Protocol.IPTM -> Protocol.IPTM
      software.amazon.awscdk.services.ec2.Protocol.NSFNET_IGP -> Protocol.NSFNET_IGP
      software.amazon.awscdk.services.ec2.Protocol.DGP -> Protocol.DGP
      software.amazon.awscdk.services.ec2.Protocol.TCF -> Protocol.TCF
      software.amazon.awscdk.services.ec2.Protocol.EIGRP -> Protocol.EIGRP
      software.amazon.awscdk.services.ec2.Protocol.OSPFIGP -> Protocol.OSPFIGP
      software.amazon.awscdk.services.ec2.Protocol.SPRITE_RPC -> Protocol.SPRITE_RPC
      software.amazon.awscdk.services.ec2.Protocol.LARP -> Protocol.LARP
      software.amazon.awscdk.services.ec2.Protocol.MTP -> Protocol.MTP
      software.amazon.awscdk.services.ec2.Protocol.AX_25 -> Protocol.AX_25
      software.amazon.awscdk.services.ec2.Protocol.IPIP -> Protocol.IPIP
      software.amazon.awscdk.services.ec2.Protocol.MICP -> Protocol.MICP
      software.amazon.awscdk.services.ec2.Protocol.SCC_SP -> Protocol.SCC_SP
      software.amazon.awscdk.services.ec2.Protocol.ETHERIP -> Protocol.ETHERIP
      software.amazon.awscdk.services.ec2.Protocol.ENCAP -> Protocol.ENCAP
      software.amazon.awscdk.services.ec2.Protocol.ANY_ENC -> Protocol.ANY_ENC
      software.amazon.awscdk.services.ec2.Protocol.GMTP -> Protocol.GMTP
      software.amazon.awscdk.services.ec2.Protocol.IFMP -> Protocol.IFMP
      software.amazon.awscdk.services.ec2.Protocol.PNNI -> Protocol.PNNI
      software.amazon.awscdk.services.ec2.Protocol.PIM -> Protocol.PIM
      software.amazon.awscdk.services.ec2.Protocol.ARIS -> Protocol.ARIS
      software.amazon.awscdk.services.ec2.Protocol.SCPS -> Protocol.SCPS
      software.amazon.awscdk.services.ec2.Protocol.QNX -> Protocol.QNX
      software.amazon.awscdk.services.ec2.Protocol.A_N -> Protocol.A_N
      software.amazon.awscdk.services.ec2.Protocol.IPCOMP -> Protocol.IPCOMP
      software.amazon.awscdk.services.ec2.Protocol.SNP -> Protocol.SNP
      software.amazon.awscdk.services.ec2.Protocol.COMPAQ_PEER -> Protocol.COMPAQ_PEER
      software.amazon.awscdk.services.ec2.Protocol.IPX_IN_IP -> Protocol.IPX_IN_IP
      software.amazon.awscdk.services.ec2.Protocol.VRRP -> Protocol.VRRP
      software.amazon.awscdk.services.ec2.Protocol.PGM -> Protocol.PGM
      software.amazon.awscdk.services.ec2.Protocol.ANY_0_HOP -> Protocol.ANY_0_HOP
      software.amazon.awscdk.services.ec2.Protocol.L2_T_P -> Protocol.L2_T_P
      software.amazon.awscdk.services.ec2.Protocol.DDX -> Protocol.DDX
      software.amazon.awscdk.services.ec2.Protocol.IATP -> Protocol.IATP
      software.amazon.awscdk.services.ec2.Protocol.STP -> Protocol.STP
      software.amazon.awscdk.services.ec2.Protocol.SRP -> Protocol.SRP
      software.amazon.awscdk.services.ec2.Protocol.UTI -> Protocol.UTI
      software.amazon.awscdk.services.ec2.Protocol.SMP -> Protocol.SMP
      software.amazon.awscdk.services.ec2.Protocol.SM -> Protocol.SM
      software.amazon.awscdk.services.ec2.Protocol.PTP -> Protocol.PTP
      software.amazon.awscdk.services.ec2.Protocol.ISIS_IPV4 -> Protocol.ISIS_IPV4
      software.amazon.awscdk.services.ec2.Protocol.FIRE -> Protocol.FIRE
      software.amazon.awscdk.services.ec2.Protocol.CRTP -> Protocol.CRTP
      software.amazon.awscdk.services.ec2.Protocol.CRUDP -> Protocol.CRUDP
      software.amazon.awscdk.services.ec2.Protocol.SSCOPMCE -> Protocol.SSCOPMCE
      software.amazon.awscdk.services.ec2.Protocol.IPLT -> Protocol.IPLT
      software.amazon.awscdk.services.ec2.Protocol.SPS -> Protocol.SPS
      software.amazon.awscdk.services.ec2.Protocol.PIPE -> Protocol.PIPE
      software.amazon.awscdk.services.ec2.Protocol.SCTP -> Protocol.SCTP
      software.amazon.awscdk.services.ec2.Protocol.FC -> Protocol.FC
      software.amazon.awscdk.services.ec2.Protocol.RSVP_E2E_IGNORE -> Protocol.RSVP_E2E_IGNORE
      software.amazon.awscdk.services.ec2.Protocol.MOBILITY_HEADER -> Protocol.MOBILITY_HEADER
      software.amazon.awscdk.services.ec2.Protocol.UDPLITE -> Protocol.UDPLITE
      software.amazon.awscdk.services.ec2.Protocol.MPLS_IN_IP -> Protocol.MPLS_IN_IP
      software.amazon.awscdk.services.ec2.Protocol.MANET -> Protocol.MANET
      software.amazon.awscdk.services.ec2.Protocol.HIP -> Protocol.HIP
      software.amazon.awscdk.services.ec2.Protocol.SHIM6 -> Protocol.SHIM6
      software.amazon.awscdk.services.ec2.Protocol.WESP -> Protocol.WESP
      software.amazon.awscdk.services.ec2.Protocol.ROHC -> Protocol.ROHC
      software.amazon.awscdk.services.ec2.Protocol.ETHERNET -> Protocol.ETHERNET
      software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_1 -> Protocol.EXPERIMENT_1
      software.amazon.awscdk.services.ec2.Protocol.EXPERIMENT_2 -> Protocol.EXPERIMENT_2
      software.amazon.awscdk.services.ec2.Protocol.RESERVED -> Protocol.RESERVED
    }

    internal fun unwrap(wrapped: Protocol): software.amazon.awscdk.services.ec2.Protocol =
        wrapped.cdkObject
  }
}
