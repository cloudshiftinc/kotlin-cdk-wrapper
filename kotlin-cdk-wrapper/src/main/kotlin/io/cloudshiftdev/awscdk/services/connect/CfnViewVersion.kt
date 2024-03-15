@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnViewVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnViewVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  public open fun attrViewVersionArn(): String = unwrap(this).getAttrViewVersionArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  public open fun viewArn(): String = unwrap(this).getViewArn()

  public open fun viewArn(`value`: String) {
    unwrap(this).setViewArn(`value`)
  }

  public open fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()

  public open fun viewContentSha256(`value`: String) {
    unwrap(this).setViewContentSha256(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun versionDescription(versionDescription: String)

    public fun viewArn(viewArn: String)

    public fun viewContentSha256(viewContentSha256: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnViewVersion.Builder =
        software.amazon.awscdk.services.connect.CfnViewVersion.Builder.create(scope, id)

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    override fun viewContentSha256(viewContentSha256: String) {
      cdkBuilder.viewContentSha256(viewContentSha256)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnViewVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnViewVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnViewVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnViewVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnViewVersion):
        CfnViewVersion = CfnViewVersion(cdkObject)

    internal fun unwrap(wrapped: CfnViewVersion):
        software.amazon.awscdk.services.connect.CfnViewVersion = wrapped.cdkObject
  }
}
