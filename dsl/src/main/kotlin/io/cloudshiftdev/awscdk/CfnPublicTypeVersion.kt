package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPublicTypeVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnPublicTypeVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun arn(): String? = unwrap(this).getArn()

  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
  }

  public open fun attrPublicTypeArn(): String = unwrap(this).getAttrPublicTypeArn()

  public open fun attrPublisherId(): String = unwrap(this).getAttrPublisherId()

  public open fun attrTypeVersionArn(): String = unwrap(this).getAttrTypeVersionArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logDeliveryBucket(): String? = unwrap(this).getLogDeliveryBucket()

  public open fun logDeliveryBucket(`value`: String) {
    unwrap(this).setLogDeliveryBucket(`value`)
  }

  public open fun publicVersionNumber(): String? = unwrap(this).getPublicVersionNumber()

  public open fun publicVersionNumber(`value`: String) {
    unwrap(this).setPublicVersionNumber(`value`)
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun typeName(): String? = unwrap(this).getTypeName()

  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  public interface Builder {
    public fun arn(arn: String)

    public fun logDeliveryBucket(logDeliveryBucket: String)

    public fun publicVersionNumber(publicVersionNumber: String)

    public fun type(type: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnPublicTypeVersion.Builder =
        software.amazon.awscdk.CfnPublicTypeVersion.Builder.create(scope, id)

    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    override fun logDeliveryBucket(logDeliveryBucket: String) {
      cdkBuilder.logDeliveryBucket(logDeliveryBucket)
    }

    override fun publicVersionNumber(publicVersionNumber: String) {
      cdkBuilder.publicVersionNumber(publicVersionNumber)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnPublicTypeVersion = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublicTypeVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublicTypeVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnPublicTypeVersion): CfnPublicTypeVersion
        = CfnPublicTypeVersion(cdkObject)

    internal fun unwrap(wrapped: CfnPublicTypeVersion): software.amazon.awscdk.CfnPublicTypeVersion
        = wrapped.cdkObject
  }
}
