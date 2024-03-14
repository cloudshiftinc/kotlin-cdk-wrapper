package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAutodefinedReverse(): String = unwrap(this).getAttrAutodefinedReverse()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun autodefinedReverseFlag(): String = unwrap(this).getAutodefinedReverseFlag()

  public open fun autodefinedReverseFlag(`value`: String) {
    unwrap(this).setAutodefinedReverseFlag(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceId(): String = unwrap(this).getResourceId()

  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  public interface Builder {
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
    }

    public fun resourceId(resourceId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig.Builder.create(scope, id)

    public override fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
      cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    public override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverConfig):
        CfnResolverConfig = CfnResolverConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverConfig = wrapped.cdkObject
  }
}
