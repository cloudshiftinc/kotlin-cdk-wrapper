package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class Connections internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.Connections,
) : IConnectable {
  /**
   * Add a security group to the list of security groups managed by this object.
   *
   * @param securityGroups 
   */
  public open fun addSecurityGroup(securityGroups: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroups.let(ISecurityGroup::unwrap))
  }

  /**
   * Allow connections from the peer on our default port.
   *
   * Even if the peer has a default port, we will always use our default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowDefaultPortFrom(other: IConnectable) {
    unwrap(this).allowDefaultPortFrom(other.let(IConnectable::unwrap))
  }

  /**
   * Allow connections from the peer on our default port.
   *
   * Even if the peer has a default port, we will always use our default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowDefaultPortFrom(other: IConnectable, description: String) {
    unwrap(this).allowDefaultPortFrom(other.let(IConnectable::unwrap), description)
  }

  /**
   * Allow default connections from all IPv4 ranges.
   *
   * @param description
   */
  public open fun allowDefaultPortFromAnyIpv4() {
    unwrap(this).allowDefaultPortFromAnyIpv4()
  }

  /**
   * Allow default connections from all IPv4 ranges.
   *
   * @param description
   */
  public open fun allowDefaultPortFromAnyIpv4(description: String) {
    unwrap(this).allowDefaultPortFromAnyIpv4(description)
  }

  /**
   * Allow hosts inside the security group to connect to each other.
   *
   * @param description
   */
  public open fun allowDefaultPortInternally() {
    unwrap(this).allowDefaultPortInternally()
  }

  /**
   * Allow hosts inside the security group to connect to each other.
   *
   * @param description
   */
  public open fun allowDefaultPortInternally(description: String) {
    unwrap(this).allowDefaultPortInternally(description)
  }

  /**
   * Allow connections from the peer on our default port.
   *
   * Even if the peer has a default port, we will always use our default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowDefaultPortTo(other: IConnectable) {
    unwrap(this).allowDefaultPortTo(other.let(IConnectable::unwrap))
  }

  /**
   * Allow connections from the peer on our default port.
   *
   * Even if the peer has a default port, we will always use our default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowDefaultPortTo(other: IConnectable, description: String) {
    unwrap(this).allowDefaultPortTo(other.let(IConnectable::unwrap), description)
  }

  /**
   * Allow connections from the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  public open fun allowFrom(other: IConnectable, portRange: Port) {
    unwrap(this).allowFrom(other.let(IConnectable::unwrap), portRange.let(Port::unwrap))
  }

  /**
   * Allow connections from the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02238d1949edf07fd1277138ca4be646ffde5a8ba3fece922f1f3af0bd5ae079")
  public open fun allowFrom(other: IConnectable, portRange: Port.Builder.() -> Unit): Unit =
      allowFrom(other, Port(portRange))

  /**
   * Allow connections from the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  public open fun allowFrom(
    other: IConnectable,
    portRange: Port,
    description: String,
  ) {
    unwrap(this).allowFrom(other.let(IConnectable::unwrap), portRange.let(Port::unwrap),
        description)
  }

  /**
   * Allow from any IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowFromAnyIpv4(portRange: Port) {
    unwrap(this).allowFromAnyIpv4(portRange.let(Port::unwrap))
  }

  /**
   * Allow from any IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("748876ab598a9d355a790825c24fad35701b805e4817edf9b4cd022801d75834")
  public open fun allowFromAnyIpv4(portRange: Port.Builder.() -> Unit): Unit =
      allowFromAnyIpv4(Port(portRange))

  /**
   * Allow from any IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowFromAnyIpv4(portRange: Port, description: String) {
    unwrap(this).allowFromAnyIpv4(portRange.let(Port::unwrap), description)
  }

  /**
   * Allow hosts inside the security group to connect to each other on the given port.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowInternally(portRange: Port) {
    unwrap(this).allowInternally(portRange.let(Port::unwrap))
  }

  /**
   * Allow hosts inside the security group to connect to each other on the given port.
   *
   * @param portRange 
   * @param description
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db68d975561bb0ad11cb8a24d32265af9627649287fe6fa10517d329bf2dedba")
  public open fun allowInternally(portRange: Port.Builder.() -> Unit): Unit =
      allowInternally(Port(portRange))

  /**
   * Allow hosts inside the security group to connect to each other on the given port.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowInternally(portRange: Port, description: String) {
    unwrap(this).allowInternally(portRange.let(Port::unwrap), description)
  }

  /**
   * Allow connections to the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  public open fun allowTo(other: IConnectable, portRange: Port) {
    unwrap(this).allowTo(other.let(IConnectable::unwrap), portRange.let(Port::unwrap))
  }

  /**
   * Allow connections to the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5b975caf22f1a32e319dc561aa3278d8b1f602c35043ae33b067c95ce78116b")
  public open fun allowTo(other: IConnectable, portRange: Port.Builder.() -> Unit): Unit =
      allowTo(other, Port(portRange))

  /**
   * Allow connections to the peer on the given port.
   *
   * @param other 
   * @param portRange 
   * @param description
   */
  public open fun allowTo(
    other: IConnectable,
    portRange: Port,
    description: String,
  ) {
    unwrap(this).allowTo(other.let(IConnectable::unwrap), portRange.let(Port::unwrap), description)
  }

  /**
   * Allow to all IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowToAnyIpv4(portRange: Port) {
    unwrap(this).allowToAnyIpv4(portRange.let(Port::unwrap))
  }

  /**
   * Allow to all IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2ca5bd260644cf192a782f9044fc8e280622310b6842746b63ee4e7b8a3ca78")
  public open fun allowToAnyIpv4(portRange: Port.Builder.() -> Unit): Unit =
      allowToAnyIpv4(Port(portRange))

  /**
   * Allow to all IPv4 ranges.
   *
   * @param portRange 
   * @param description
   */
  public open fun allowToAnyIpv4(portRange: Port, description: String) {
    unwrap(this).allowToAnyIpv4(portRange.let(Port::unwrap), description)
  }

  /**
   * Allow connections to the security group on their default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowToDefaultPort(other: IConnectable) {
    unwrap(this).allowToDefaultPort(other.let(IConnectable::unwrap))
  }

  /**
   * Allow connections to the security group on their default port.
   *
   * @param other 
   * @param description
   */
  public open fun allowToDefaultPort(other: IConnectable, description: String) {
    unwrap(this).allowToDefaultPort(other.let(IConnectable::unwrap), description)
  }

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The default port configured for this connection peer, if available.
   */
  public open fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  /**
   *
   */
  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Connections].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object. 
     */
    public fun defaultPort(defaultPort: Port)

    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("134875f63575344e60e9fde0e44020cbaaebbf3365cdf9a2e6c7d703571b0f2a")
    public fun defaultPort(defaultPort: Port.Builder.() -> Unit)

    /**
     * Class that represents the rule by which others can connect to this connectable.
     *
     * This object is required, but will be derived from securityGroup if that is passed.
     *
     * Default: Derived from securityGroup if set.
     *
     * @param peer Class that represents the rule by which others can connect to this connectable. 
     */
    public fun peer(peer: IPeer)

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Connections.Builder =
        software.amazon.awscdk.services.ec2.Connections.Builder.create()

    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object. 
     */
    override fun defaultPort(defaultPort: Port) {
      cdkBuilder.defaultPort(defaultPort.let(Port::unwrap))
    }

    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     *
     * @param defaultPort Default port range for initiating connections to and from this object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("134875f63575344e60e9fde0e44020cbaaebbf3365cdf9a2e6c7d703571b0f2a")
    override fun defaultPort(defaultPort: Port.Builder.() -> Unit): Unit =
        defaultPort(Port(defaultPort))

    /**
     * Class that represents the rule by which others can connect to this connectable.
     *
     * This object is required, but will be derived from securityGroup if that is passed.
     *
     * Default: Derived from securityGroup if set.
     *
     * @param peer Class that represents the rule by which others can connect to this connectable. 
     */
    override fun peer(peer: IPeer) {
      cdkBuilder.peer(peer.let(IPeer::unwrap))
    }

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     *
     * @param securityGroups What securityGroup(s) this object is managing connections for. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.ec2.Connections = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Connections {
      val builderImpl = BuilderImpl()
      return Connections(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Connections): Connections =
        Connections(cdkObject)

    internal fun unwrap(wrapped: Connections): software.amazon.awscdk.services.ec2.Connections =
        wrapped.cdkObject
  }
}
