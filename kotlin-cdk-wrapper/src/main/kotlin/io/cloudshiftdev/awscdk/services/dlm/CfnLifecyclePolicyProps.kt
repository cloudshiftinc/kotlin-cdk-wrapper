@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dlm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLifecyclePolicyProps {
  public fun copyTags(): Any? = unwrap(this).getCopyTags()

  public fun createInterval(): Number? = unwrap(this).getCreateInterval()

  public fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

  public fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

  public fun description(): String? = unwrap(this).getDescription()

  public fun exclusions(): Any? = unwrap(this).getExclusions()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

  public fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

  public fun retainInterval(): Number? = unwrap(this).getRetainInterval()

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun copyTags(copyTags: Boolean)

    public fun copyTags(copyTags: IResolvable)

    public fun createInterval(createInterval: Number)

    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any)

    public fun defaultPolicy(defaultPolicy: String)

    public fun description(description: String)

    public fun exclusions(exclusions: IResolvable)

    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91eb417783a1960b864c154099899d6b138c5d6554ddce6485b9977155f17115")
    public fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty.Builder.() -> Unit)

    public fun executionRoleArn(executionRoleArn: String)

    public fun extendDeletion(extendDeletion: Boolean)

    public fun extendDeletion(extendDeletion: IResolvable)

    public fun policyDetails(policyDetails: IResolvable)

    public fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5204ac81e405747abb77284012e4de45256ef9506230380e55e19318b7e777e4")
    public
        fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit)

    public fun retainInterval(retainInterval: Number)

    public fun state(state: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.Builder =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps.builder()

    override fun copyTags(copyTags: Boolean) {
      cdkBuilder.copyTags(copyTags)
    }

    override fun copyTags(copyTags: IResolvable) {
      cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
    }

    override fun createInterval(createInterval: Number) {
      cdkBuilder.createInterval(createInterval)
    }

    override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    override fun defaultPolicy(defaultPolicy: String) {
      cdkBuilder.defaultPolicy(defaultPolicy)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun exclusions(exclusions: IResolvable) {
      cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
    }

    override fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty) {
      cdkBuilder.exclusions(exclusions.let(CfnLifecyclePolicy.ExclusionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91eb417783a1960b864c154099899d6b138c5d6554ddce6485b9977155f17115")
    override fun exclusions(exclusions: CfnLifecyclePolicy.ExclusionsProperty.Builder.() -> Unit):
        Unit = exclusions(CfnLifecyclePolicy.ExclusionsProperty(exclusions))

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun extendDeletion(extendDeletion: Boolean) {
      cdkBuilder.extendDeletion(extendDeletion)
    }

    override fun extendDeletion(extendDeletion: IResolvable) {
      cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty) {
      cdkBuilder.policyDetails(policyDetails.let(CfnLifecyclePolicy.PolicyDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5204ac81e405747abb77284012e4de45256ef9506230380e55e19318b7e777e4")
    override
        fun policyDetails(policyDetails: CfnLifecyclePolicy.PolicyDetailsProperty.Builder.() -> Unit):
        Unit = policyDetails(CfnLifecyclePolicy.PolicyDetailsProperty(policyDetails))

    override fun retainInterval(retainInterval: Number) {
      cdkBuilder.retainInterval(retainInterval)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps,
  ) : CdkObject(cdkObject), CfnLifecyclePolicyProps {
    override fun copyTags(): Any? = unwrap(this).getCopyTags()

    override fun createInterval(): Number? = unwrap(this).getCreateInterval()

    override fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

    override fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

    override fun description(): String? = unwrap(this).getDescription()

    override fun exclusions(): Any? = unwrap(this).getExclusions()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

    override fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

    override fun retainInterval(): Number? = unwrap(this).getRetainInterval()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecyclePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps):
        CfnLifecyclePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicyProps):
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dlm.CfnLifecyclePolicyProps
  }
}
