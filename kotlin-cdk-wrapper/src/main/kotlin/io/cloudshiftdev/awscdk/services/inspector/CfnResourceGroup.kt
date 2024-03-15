@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun resourceGroupTags(): Any = unwrap(this).getResourceGroupTags()

  public open fun resourceGroupTags(`value`: IResolvable) {
    unwrap(this).setResourceGroupTags(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceGroupTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setResourceGroupTags(__idx_ac66f0)
  }

  public open fun resourceGroupTags(vararg __idx_ac66f0: Any): Unit =
      resourceGroupTags(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun resourceGroupTags(resourceGroupTags: IResolvable)

    public fun resourceGroupTags(resourceGroupTags: List<Any>)

    public fun resourceGroupTags(vararg resourceGroupTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnResourceGroup.Builder =
        software.amazon.awscdk.services.inspector.CfnResourceGroup.Builder.create(scope, id)

    override fun resourceGroupTags(resourceGroupTags: IResolvable) {
      cdkBuilder.resourceGroupTags(resourceGroupTags.let(IResolvable::unwrap))
    }

    override fun resourceGroupTags(resourceGroupTags: List<Any>) {
      cdkBuilder.resourceGroupTags(resourceGroupTags)
    }

    override fun resourceGroupTags(vararg resourceGroupTags: Any): Unit =
        resourceGroupTags(resourceGroupTags.toList())

    public fun build(): software.amazon.awscdk.services.inspector.CfnResourceGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.inspector.CfnResourceGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroup):
        CfnResourceGroup = CfnResourceGroup(cdkObject)

    internal fun unwrap(wrapped: CfnResourceGroup):
        software.amazon.awscdk.services.inspector.CfnResourceGroup = wrapped.cdkObject
  }
}
