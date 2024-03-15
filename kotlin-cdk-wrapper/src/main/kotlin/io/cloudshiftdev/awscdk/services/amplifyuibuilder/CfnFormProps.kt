@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnFormProps {
  public fun appId(): String? = unwrap(this).getAppId()

  public fun cta(): Any? = unwrap(this).getCta()

  public fun dataType(): Any? = unwrap(this).getDataType()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun fields(): Any? = unwrap(this).getFields()

  public fun formActionType(): String? = unwrap(this).getFormActionType()

  public fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

  public fun name(): String? = unwrap(this).getName()

  public fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  public fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

  public fun style(): Any? = unwrap(this).getStyle()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun cta(cta: IResolvable)

    public fun cta(cta: CfnForm.FormCTAProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4d8a788aea136ad682a689412b673fdd09333c0956ff066b535e602cff4c3bc")
    public fun cta(cta: CfnForm.FormCTAProperty.Builder.() -> Unit)

    public fun dataType(dataType: IResolvable)

    public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd34f6fe67bf4eaa90a5548a2aa03a07acb9ed0b6d948557e889028044dc9c2d")
    public fun dataType(dataType: CfnForm.FormDataTypeConfigProperty.Builder.() -> Unit)

    public fun environmentName(environmentName: String)

    public fun fields(fields: IResolvable)

    public fun fields(fields: Map<String, Any>)

    public fun formActionType(formActionType: String)

    public fun labelDecorator(labelDecorator: String)

    public fun name(name: String)

    public fun schemaVersion(schemaVersion: String)

    public fun sectionalElements(sectionalElements: IResolvable)

    public fun sectionalElements(sectionalElements: Map<String, Any>)

    public fun style(style: IResolvable)

    public fun style(style: CfnForm.FormStyleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a68dcfdb931875e80d54d675242565a871d9d06bcfc323ca08f657e4ad7a87")
    public fun style(style: CfnForm.FormStyleProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps.builder()

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun cta(cta: IResolvable) {
      cdkBuilder.cta(cta.let(IResolvable::unwrap))
    }

    override fun cta(cta: CfnForm.FormCTAProperty) {
      cdkBuilder.cta(cta.let(CfnForm.FormCTAProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4d8a788aea136ad682a689412b673fdd09333c0956ff066b535e602cff4c3bc")
    override fun cta(cta: CfnForm.FormCTAProperty.Builder.() -> Unit): Unit =
        cta(CfnForm.FormCTAProperty(cta))

    override fun dataType(dataType: IResolvable) {
      cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
    }

    override fun dataType(dataType: CfnForm.FormDataTypeConfigProperty) {
      cdkBuilder.dataType(dataType.let(CfnForm.FormDataTypeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd34f6fe67bf4eaa90a5548a2aa03a07acb9ed0b6d948557e889028044dc9c2d")
    override fun dataType(dataType: CfnForm.FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
        dataType(CfnForm.FormDataTypeConfigProperty(dataType))

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    override fun fields(fields: Map<String, Any>) {
      cdkBuilder.fields(fields)
    }

    override fun formActionType(formActionType: String) {
      cdkBuilder.formActionType(formActionType)
    }

    override fun labelDecorator(labelDecorator: String) {
      cdkBuilder.labelDecorator(labelDecorator)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    override fun sectionalElements(sectionalElements: IResolvable) {
      cdkBuilder.sectionalElements(sectionalElements.let(IResolvable::unwrap))
    }

    override fun sectionalElements(sectionalElements: Map<String, Any>) {
      cdkBuilder.sectionalElements(sectionalElements)
    }

    override fun style(style: IResolvable) {
      cdkBuilder.style(style.let(IResolvable::unwrap))
    }

    override fun style(style: CfnForm.FormStyleProperty) {
      cdkBuilder.style(style.let(CfnForm.FormStyleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a68dcfdb931875e80d54d675242565a871d9d06bcfc323ca08f657e4ad7a87")
    override fun style(style: CfnForm.FormStyleProperty.Builder.() -> Unit): Unit =
        style(CfnForm.FormStyleProperty(style))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps,
  ) : CdkObject(cdkObject), CfnFormProps {
    override fun appId(): String? = unwrap(this).getAppId()

    override fun cta(): Any? = unwrap(this).getCta()

    override fun dataType(): Any? = unwrap(this).getDataType()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun fields(): Any? = unwrap(this).getFields()

    override fun formActionType(): String? = unwrap(this).getFormActionType()

    override fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

    override fun name(): String? = unwrap(this).getName()

    override fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

    override fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

    override fun style(): Any? = unwrap(this).getStyle()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFormProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps):
        CfnFormProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFormProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
  }
}
