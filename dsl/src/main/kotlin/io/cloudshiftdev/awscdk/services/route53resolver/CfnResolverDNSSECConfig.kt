package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverDNSSECConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrValidationStatus(): String = unwrap(this).getAttrValidationStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceId(): String? = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public interface Builder {
    public fun resourceId(resourceId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig.Builder.create(scope,
        id)

    public override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverDNSSECConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverDNSSECConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig):
        CfnResolverDNSSECConfig = CfnResolverDNSSECConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverDNSSECConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig = wrapped.cdkObject
  }
}
