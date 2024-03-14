package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroup,
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

  public interface Builder {
    public fun resourceGroupTags(resourceGroupTags: IResolvable)

    public fun resourceGroupTags(resourceGroupTags: List<Any>)
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

    public fun build(): software.amazon.awscdk.services.inspector.CfnResourceGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
