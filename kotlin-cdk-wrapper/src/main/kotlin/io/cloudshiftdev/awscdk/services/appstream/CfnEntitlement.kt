@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEntitlement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement,
) : CfnResource(cdkObject), IInspectable {
  public open fun appVisibility(): String = unwrap(this).getAppVisibility()

  public open fun appVisibility(`value`: String) {
    unwrap(this).setAppVisibility(`value`)
  }

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attributes(): Any = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttributes(__idx_ac66f0)
  }

  public open fun attributes(vararg __idx_ac66f0: Any): Unit = attributes(__idx_ac66f0.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun appVisibility(appVisibility: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: List<Any>)

    public fun attributes(vararg attributes: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun stackName(stackName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnEntitlement.Builder =
        software.amazon.awscdk.services.appstream.CfnEntitlement.Builder.create(scope, id)

    override fun appVisibility(appVisibility: String) {
      cdkBuilder.appVisibility(appVisibility)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: List<Any>) {
      cdkBuilder.attributes(attributes)
    }

    override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlement =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnEntitlement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEntitlement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEntitlement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement):
        CfnEntitlement = CfnEntitlement(cdkObject)

    internal fun unwrap(wrapped: CfnEntitlement):
        software.amazon.awscdk.services.appstream.CfnEntitlement = wrapped.cdkObject
  }

  public interface AttributeProperty {
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty,
    ) : CdkObject(cdkObject), AttributeProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty):
          AttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnEntitlement.AttributeProperty
    }
  }
}
