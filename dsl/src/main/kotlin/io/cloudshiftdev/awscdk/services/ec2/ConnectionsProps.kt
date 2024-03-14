package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ConnectionsProps {
  /**
   * Default port range for initiating connections to and from this object.
   *
   * Default: - No default port
   */
  public fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  /**
   * Class that represents the rule by which others can connect to this connectable.
   *
   * This object is required, but will be derived from securityGroup if that is passed.
   *
   * Default: Derived from securityGroup if set.
   */
  public fun peer(): IPeer? = unwrap(this).getPeer()?.let(IPeer::wrap)

  /**
   * What securityGroup(s) this object is managing connections for.
   *
   * Default: No security groups
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * A builder for [ConnectionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    public fun defaultPort(defaultPort: Port)

    /**
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c78bfbd5ed63b14520ebccba252fc83bc95d1023453ee6b9c92a2384462faa71")
    public fun defaultPort(defaultPort: Port.Builder.() -> Unit)

    /**
     * @param peer Class that represents the rule by which others can connect to this connectable.
     * This object is required, but will be derived from securityGroup if that is passed.
     */
    public fun peer(peer: IPeer)

    /**
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConnectionsProps.Builder =
        software.amazon.awscdk.services.ec2.ConnectionsProps.builder()

    /**
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    override fun defaultPort(defaultPort: Port) {
      cdkBuilder.defaultPort(defaultPort.let(Port::unwrap))
    }

    /**
     * @param defaultPort Default port range for initiating connections to and from this object.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c78bfbd5ed63b14520ebccba252fc83bc95d1023453ee6b9c92a2384462faa71")
    override fun defaultPort(defaultPort: Port.Builder.() -> Unit): Unit =
        defaultPort(Port(defaultPort))

    /**
     * @param peer Class that represents the rule by which others can connect to this connectable.
     * This object is required, but will be derived from securityGroup if that is passed.
     */
    override fun peer(peer: IPeer) {
      cdkBuilder.peer(peer.let(IPeer::unwrap))
    }

    /**
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups What securityGroup(s) this object is managing connections for.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.ec2.ConnectionsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConnectionsProps,
  ) : CdkObject(cdkObject), ConnectionsProps {
    /**
     * Default port range for initiating connections to and from this object.
     *
     * Default: - No default port
     */
    override fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

    /**
     * Class that represents the rule by which others can connect to this connectable.
     *
     * This object is required, but will be derived from securityGroup if that is passed.
     *
     * Default: Derived from securityGroup if set.
     */
    override fun peer(): IPeer? = unwrap(this).getPeer()?.let(IPeer::wrap)

    /**
     * What securityGroup(s) this object is managing connections for.
     *
     * Default: No security groups
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConnectionsProps):
        ConnectionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionsProps):
        software.amazon.awscdk.services.ec2.ConnectionsProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ConnectionsProps
  }
}
