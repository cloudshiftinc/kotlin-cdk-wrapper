@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBaiduChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiKey(): String = unwrap(this).getApiKey()

  public open fun apiKey(`value`: String) {
    unwrap(this).setApiKey(`value`)
  }

  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun secretKey(): String = unwrap(this).getSecretKey()

  public open fun secretKey(`value`: String) {
    unwrap(this).setSecretKey(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun apiKey(apiKey: String)

    public fun applicationId(applicationId: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun secretKey(secretKey: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder.create(scope, id)

    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnBaiduChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBaiduChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBaiduChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannel):
        CfnBaiduChannel = CfnBaiduChannel(cdkObject)

    internal fun unwrap(wrapped: CfnBaiduChannel):
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannel = wrapped.cdkObject
  }
}
