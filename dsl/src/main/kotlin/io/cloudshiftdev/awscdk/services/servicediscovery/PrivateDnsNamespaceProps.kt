package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit

public interface PrivateDnsNamespaceProps : BaseNamespaceProps {
  /**
   * The Amazon VPC that you want to associate the namespace with.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [PrivateDnsNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the Namespace.
     */
    public fun description(description: String)

    /**
     * @param name A name for the Namespace. 
     */
    public fun name(name: String)

    /**
     * @param vpc The Amazon VPC that you want to associate the namespace with. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps.builder()

    /**
     * @param description A description of the Namespace.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A name for the Namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param vpc The Amazon VPC that you want to associate the namespace with. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps,
  ) : CdkObject(cdkObject), PrivateDnsNamespaceProps {
    /**
     * A description of the Namespace.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the Namespace.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon VPC that you want to associate the namespace with.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateDnsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps):
        PrivateDnsNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrivateDnsNamespaceProps):
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
  }
}
