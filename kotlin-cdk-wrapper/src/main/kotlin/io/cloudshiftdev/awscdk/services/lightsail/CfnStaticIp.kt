@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStaticIp internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIp,
) : CfnResource(cdkObject), IInspectable {
  public open fun attachedTo(): String? = unwrap(this).getAttachedTo()

  public open fun attachedTo(`value`: String) {
    unwrap(this).setAttachedTo(`value`)
  }

  public open fun attrIpAddress(): String = unwrap(this).getAttrIpAddress()

  public open fun attrIsAttached(): IResolvable =
      unwrap(this).getAttrIsAttached().let(IResolvable::wrap)

  public open fun attrStaticIpArn(): String = unwrap(this).getAttrStaticIpArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun staticIpName(): String = unwrap(this).getStaticIpName()

  public open fun staticIpName(`value`: String) {
    unwrap(this).setStaticIpName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun attachedTo(attachedTo: String)

    public fun staticIpName(staticIpName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder =
        software.amazon.awscdk.services.lightsail.CfnStaticIp.Builder.create(scope, id)

    override fun attachedTo(attachedTo: String) {
      cdkBuilder.attachedTo(attachedTo)
    }

    override fun staticIpName(staticIpName: String) {
      cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnStaticIp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnStaticIp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStaticIp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStaticIp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnStaticIp): CfnStaticIp
        = CfnStaticIp(cdkObject)

    internal fun unwrap(wrapped: CfnStaticIp): software.amazon.awscdk.services.lightsail.CfnStaticIp
        = wrapped.cdkObject
  }
}
