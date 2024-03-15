@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUsagePlanKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyId(): String = unwrap(this).getKeyId()

  public open fun keyId(`value`: String) {
    unwrap(this).setKeyId(`value`)
  }

  public open fun keyType(): String = unwrap(this).getKeyType()

  public open fun keyType(`value`: String) {
    unwrap(this).setKeyType(`value`)
  }

  public open fun usagePlanId(): String = unwrap(this).getUsagePlanId()

  public open fun usagePlanId(`value`: String) {
    unwrap(this).setUsagePlanId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun keyId(keyId: String)

    public fun keyType(keyType: String)

    public fun usagePlanId(usagePlanId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.Builder =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.Builder.create(scope, id)

    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    override fun usagePlanId(usagePlanId: String) {
      cdkBuilder.usagePlanId(usagePlanId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnUsagePlanKey =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUsagePlanKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUsagePlanKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnUsagePlanKey):
        CfnUsagePlanKey = CfnUsagePlanKey(cdkObject)

    internal fun unwrap(wrapped: CfnUsagePlanKey):
        software.amazon.awscdk.services.apigateway.CfnUsagePlanKey = wrapped.cdkObject
  }
}
