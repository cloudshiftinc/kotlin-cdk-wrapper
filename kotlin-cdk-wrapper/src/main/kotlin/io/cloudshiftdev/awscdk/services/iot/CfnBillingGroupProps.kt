@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBillingGroupProps {
  public fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

  public fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun billingGroupName(billingGroupName: String)

    public fun billingGroupProperties(billingGroupProperties: IResolvable)

    public
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c544bf3920ba2a8b0322d214916799d0192f909bdbfafeb33840d406b2e32f5")
    public
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnBillingGroupProps.Builder =
        software.amazon.awscdk.services.iot.CfnBillingGroupProps.builder()

    override fun billingGroupName(billingGroupName: String) {
      cdkBuilder.billingGroupName(billingGroupName)
    }

    override fun billingGroupProperties(billingGroupProperties: IResolvable) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(IResolvable::unwrap))
    }

    override
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(CfnBillingGroup.BillingGroupPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c544bf3920ba2a8b0322d214916799d0192f909bdbfafeb33840d406b2e32f5")
    override
        fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty.Builder.() -> Unit):
        Unit =
        billingGroupProperties(CfnBillingGroup.BillingGroupPropertiesProperty(billingGroupProperties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnBillingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroupProps,
  ) : CdkObject(cdkObject), CfnBillingGroupProps {
    override fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

    override fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBillingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroupProps):
        CfnBillingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroupProps):
        software.amazon.awscdk.services.iot.CfnBillingGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnBillingGroupProps
  }
}
