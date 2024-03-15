@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceLinkedRole internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRole,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrRoleName(): String = unwrap(this).getAttrRoleName()

  public open fun awsServiceName(): String? = unwrap(this).getAwsServiceName()

  public open fun awsServiceName(`value`: String) {
    unwrap(this).setAwsServiceName(`value`)
  }

  public open fun customSuffix(): String? = unwrap(this).getCustomSuffix()

  public open fun customSuffix(`value`: String) {
    unwrap(this).setCustomSuffix(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun awsServiceName(awsServiceName: String)

    public fun customSuffix(customSuffix: String)

    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder.create(scope, id)

    override fun awsServiceName(awsServiceName: String) {
      cdkBuilder.awsServiceName(awsServiceName)
    }

    override fun customSuffix(customSuffix: String) {
      cdkBuilder.customSuffix(customSuffix)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnServiceLinkedRole =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceLinkedRole {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceLinkedRole(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServiceLinkedRole):
        CfnServiceLinkedRole = CfnServiceLinkedRole(cdkObject)

    internal fun unwrap(wrapped: CfnServiceLinkedRole):
        software.amazon.awscdk.services.iam.CfnServiceLinkedRole = wrapped.cdkObject
  }
}
