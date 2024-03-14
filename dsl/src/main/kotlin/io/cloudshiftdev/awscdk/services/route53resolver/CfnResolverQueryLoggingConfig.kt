package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverQueryLoggingConfig internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrAssociationCount(): Number = unwrap(this).getAttrAssociationCount()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrShareStatus(): String = unwrap(this).getAttrShareStatus()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun destinationArn(): String? = unwrap(this).getDestinationArn()

  public open fun destinationArn(`value`: String) {
    unwrap(this).setDestinationArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun destinationArn(destinationArn: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig.Builder.create(scope,
        id)

    public override fun destinationArn(destinationArn: String) {
      cdkBuilder.destinationArn(destinationArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build():
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverQueryLoggingConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverQueryLoggingConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig):
        CfnResolverQueryLoggingConfig = CfnResolverQueryLoggingConfig(cdkObject)

    internal fun unwrap(wrapped: CfnResolverQueryLoggingConfig):
        software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig =
        wrapped.cdkObject
  }
}
