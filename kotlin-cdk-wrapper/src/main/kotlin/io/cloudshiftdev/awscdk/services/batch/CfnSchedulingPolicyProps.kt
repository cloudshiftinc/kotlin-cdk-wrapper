@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSchedulingPolicyProps {
  public fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun fairsharePolicy(fairsharePolicy: IResolvable)

    public fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5208ec93f1f69db8e5e6bef25ca273523bb4a089e117da667d8fcef734b8c62e")
    public
        fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps.Builder =
        software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps.builder()

    override fun fairsharePolicy(fairsharePolicy: IResolvable) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(IResolvable::unwrap))
    }

    override fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(CfnSchedulingPolicy.FairsharePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5208ec93f1f69db8e5e6bef25ca273523bb4a089e117da667d8fcef734b8c62e")
    override
        fun fairsharePolicy(fairsharePolicy: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit):
        Unit = fairsharePolicy(CfnSchedulingPolicy.FairsharePolicyProperty(fairsharePolicy))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps,
  ) : CdkObject(cdkObject), CfnSchedulingPolicyProps {
    override fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchedulingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps):
        CfnSchedulingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchedulingPolicyProps):
        software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps
  }
}
