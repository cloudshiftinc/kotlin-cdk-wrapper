@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnLifecyclePolicyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun executionRole(): String

  public fun name(): String

  public fun policyDetails(): Any

  public fun resourceSelection(): Any

  public fun resourceType(): String

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun executionRole(executionRole: String)

    public fun name(name: String)

    public fun policyDetails(policyDetails: IResolvable)

    public fun policyDetails(policyDetails: List<Any>)

    public fun policyDetails(vararg policyDetails: Any)

    public fun resourceSelection(resourceSelection: IResolvable)

    public fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07fa5f67810a0e9f95cef2d3a0b6d4f352c1ce3deafcc43245f1d0ee7d18ac56")
    public
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty.Builder.() -> Unit)

    public fun resourceType(resourceType: String)

    public fun status(status: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: List<Any>) {
      cdkBuilder.policyDetails(policyDetails)
    }

    override fun policyDetails(vararg policyDetails: Any): Unit =
        policyDetails(policyDetails.toList())

    override fun resourceSelection(resourceSelection: IResolvable) {
      cdkBuilder.resourceSelection(resourceSelection.let(IResolvable::unwrap))
    }

    override
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty) {
      cdkBuilder.resourceSelection(resourceSelection.let(CfnLifecyclePolicy.ResourceSelectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07fa5f67810a0e9f95cef2d3a0b6d4f352c1ce3deafcc43245f1d0ee7d18ac56")
    override
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty.Builder.() -> Unit):
        Unit = resourceSelection(CfnLifecyclePolicy.ResourceSelectionProperty(resourceSelection))

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps,
  ) : CdkObject(cdkObject), CfnLifecyclePolicyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun executionRole(): String = unwrap(this).getExecutionRole()

    override fun name(): String = unwrap(this).getName()

    override fun policyDetails(): Any = unwrap(this).getPolicyDetails()

    override fun resourceSelection(): Any = unwrap(this).getResourceSelection()

    override fun resourceType(): String = unwrap(this).getResourceType()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecyclePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps):
        CfnLifecyclePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicyProps):
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps
  }
}
