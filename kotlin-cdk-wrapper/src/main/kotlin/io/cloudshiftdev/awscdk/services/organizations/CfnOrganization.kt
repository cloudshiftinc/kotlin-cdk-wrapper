@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOrganization internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.organizations.CfnOrganization,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrManagementAccountArn(): String = unwrap(this).getAttrManagementAccountArn()

  public open fun attrManagementAccountEmail(): String =
      unwrap(this).getAttrManagementAccountEmail()

  public open fun attrManagementAccountId(): String = unwrap(this).getAttrManagementAccountId()

  public open fun attrRootId(): String = unwrap(this).getAttrRootId()

  public open fun featureSet(): String? = unwrap(this).getFeatureSet()

  public open fun featureSet(`value`: String) {
    unwrap(this).setFeatureSet(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun featureSet(featureSet: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnOrganization.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganization.Builder.create(scope, id)

    override fun featureSet(featureSet: String) {
      cdkBuilder.featureSet(featureSet)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganization =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.organizations.CfnOrganization.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganization(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganization):
        CfnOrganization = CfnOrganization(cdkObject)

    internal fun unwrap(wrapped: CfnOrganization):
        software.amazon.awscdk.services.organizations.CfnOrganization = wrapped.cdkObject
  }
}
