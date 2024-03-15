@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGroupProps {
  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  public fun path(): String? = unwrap(this).getPath()

  public fun policies(): Any? = unwrap(this).getPolicies()

  @CdkDslMarker
  public interface Builder {
    public fun groupName(groupName: String)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun path(path: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroupProps.Builder =
        software.amazon.awscdk.services.iam.CfnGroupProps.builder()

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    override fun path(): String? = unwrap(this).getPath()

    override fun policies(): Any? = unwrap(this).getPolicies()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroupProps): CfnGroupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps): software.amazon.awscdk.services.iam.CfnGroupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnGroupProps
  }
}
