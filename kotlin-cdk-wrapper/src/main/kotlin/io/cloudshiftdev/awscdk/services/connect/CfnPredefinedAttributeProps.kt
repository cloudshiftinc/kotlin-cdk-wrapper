@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPredefinedAttributeProps {
  public fun instanceArn(): String

  public fun name(): String

  public fun values(): Any

  @CdkDslMarker
  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun values(values: IResolvable)

    public fun values(values: CfnPredefinedAttribute.ValuesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58159c7d861b68f42a431a870417d2855d5730baeae8138650d7c02190a61864")
    public fun values(values: CfnPredefinedAttribute.ValuesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps.Builder =
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps.builder()

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    override fun values(values: CfnPredefinedAttribute.ValuesProperty) {
      cdkBuilder.values(values.let(CfnPredefinedAttribute.ValuesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58159c7d861b68f42a431a870417d2855d5730baeae8138650d7c02190a61864")
    override fun values(values: CfnPredefinedAttribute.ValuesProperty.Builder.() -> Unit): Unit =
        values(CfnPredefinedAttribute.ValuesProperty(values))

    public fun build(): software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps,
  ) : CdkObject(cdkObject), CfnPredefinedAttributeProps {
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun values(): Any = unwrap(this).getValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPredefinedAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps):
        CfnPredefinedAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPredefinedAttributeProps):
        software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnPredefinedAttributeProps
  }
}
