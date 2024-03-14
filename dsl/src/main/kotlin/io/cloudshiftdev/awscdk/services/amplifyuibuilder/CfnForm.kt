package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnForm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appId(): String? = unwrap(this).getAppId()

  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cta(): Any? = unwrap(this).getCta()

  public open fun cta(`value`: IResolvable) {
    unwrap(this).setCta(`value`.let(IResolvable::unwrap))
  }

  public open fun cta(`value`: FormCTAProperty) {
    unwrap(this).setCta(`value`.let(FormCTAProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb1076f673b3e089f5685bc0b079fb595cc3459b471bdc7028a3ade3c4f3a4c")
  public open fun cta(`value`: FormCTAProperty.Builder.() -> Unit): Unit =
      cta(FormCTAProperty(`value`))

  public open fun dataType(): Any? = unwrap(this).getDataType()

  public open fun dataType(`value`: IResolvable) {
    unwrap(this).setDataType(`value`.let(IResolvable::unwrap))
  }

  public open fun dataType(`value`: FormDataTypeConfigProperty) {
    unwrap(this).setDataType(`value`.let(FormDataTypeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7806b80e888f87440ae112b606ae21263e313438bf0df89f99efc789ee46edf8")
  public open fun dataType(`value`: FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
      dataType(FormDataTypeConfigProperty(`value`))

  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  public open fun fields(): Any? = unwrap(this).getFields()

  public open fun fields(`value`: IResolvable) {
    unwrap(this).setFields(`value`.let(IResolvable::unwrap))
  }

  public open fun fields(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setFields(__item_ac66f0)
  }

  public open fun formActionType(): String? = unwrap(this).getFormActionType()

  public open fun formActionType(`value`: String) {
    unwrap(this).setFormActionType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun labelDecorator(): String? = unwrap(this).getLabelDecorator()

  public open fun labelDecorator(`value`: String) {
    unwrap(this).setLabelDecorator(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  public open fun schemaVersion(`value`: String) {
    unwrap(this).setSchemaVersion(`value`)
  }

  public open fun sectionalElements(): Any? = unwrap(this).getSectionalElements()

  public open fun sectionalElements(`value`: IResolvable) {
    unwrap(this).setSectionalElements(`value`.let(IResolvable::unwrap))
  }

  public open fun sectionalElements(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setSectionalElements(__item_ac66f0)
  }

  public open fun style(): Any? = unwrap(this).getStyle()

  public open fun style(`value`: IResolvable) {
    unwrap(this).setStyle(`value`.let(IResolvable::unwrap))
  }

  public open fun style(`value`: FormStyleProperty) {
    unwrap(this).setStyle(`value`.let(FormStyleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("efa1f309835fe17a6183f637d4d3d70e80726ff953c5c375773f1b5481382e29")
  public open fun style(`value`: FormStyleProperty.Builder.() -> Unit): Unit =
      style(FormStyleProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun appId(appId: String) {
    }

    public fun cta(cta: IResolvable) {
    }

    public fun cta(cta: FormCTAProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73d6a8098e1d4f4e193c57cb283688503c9689880c83a0eecbd6552e4762df03")
    public fun cta(cta: FormCTAProperty.Builder.() -> Unit) {
    }

    public fun dataType(dataType: IResolvable) {
    }

    public fun dataType(dataType: FormDataTypeConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bc3170471ecc0ebfaea6e8b3dba9bf4efabffb0f5dbcd11cac2470b510221b2")
    public fun dataType(dataType: FormDataTypeConfigProperty.Builder.() -> Unit) {
    }

    public fun environmentName(environmentName: String) {
    }

    public fun fields(fields: IResolvable) {
    }

    public fun fields(fields: Map<String, Any>) {
    }

    public fun formActionType(formActionType: String) {
    }

    public fun labelDecorator(labelDecorator: String) {
    }

    public fun name(name: String) {
    }

    public fun schemaVersion(schemaVersion: String) {
    }

    public fun sectionalElements(sectionalElements: IResolvable) {
    }

    public fun sectionalElements(sectionalElements: Map<String, Any>) {
    }

    public fun style(style: IResolvable) {
    }

    public fun style(style: FormStyleProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2634a16848ce7a3e78cc5d2160df60325ece2be95a5fa3ff0ba9456a1f0880ed")
    public fun style(style: FormStyleProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnForm.Builder.create(scope, id)

    public override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    public override fun cta(cta: IResolvable) {
      cdkBuilder.cta(cta.let(IResolvable::unwrap))
    }

    public override fun cta(cta: FormCTAProperty) {
      cdkBuilder.cta(cta.let(FormCTAProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73d6a8098e1d4f4e193c57cb283688503c9689880c83a0eecbd6552e4762df03")
    public override fun cta(cta: FormCTAProperty.Builder.() -> Unit): Unit =
        cta(FormCTAProperty(cta))

    public override fun dataType(dataType: IResolvable) {
      cdkBuilder.dataType(dataType.let(IResolvable::unwrap))
    }

    public override fun dataType(dataType: FormDataTypeConfigProperty) {
      cdkBuilder.dataType(dataType.let(FormDataTypeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bc3170471ecc0ebfaea6e8b3dba9bf4efabffb0f5dbcd11cac2470b510221b2")
    public override fun dataType(dataType: FormDataTypeConfigProperty.Builder.() -> Unit): Unit =
        dataType(FormDataTypeConfigProperty(dataType))

    public override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    public override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    public override fun fields(fields: Map<String, Any>) {
      cdkBuilder.fields(fields)
    }

    public override fun formActionType(formActionType: String) {
      cdkBuilder.formActionType(formActionType)
    }

    public override fun labelDecorator(labelDecorator: String) {
      cdkBuilder.labelDecorator(labelDecorator)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    public override fun sectionalElements(sectionalElements: IResolvable) {
      cdkBuilder.sectionalElements(sectionalElements.let(IResolvable::unwrap))
    }

    public override fun sectionalElements(sectionalElements: Map<String, Any>) {
      cdkBuilder.sectionalElements(sectionalElements)
    }

    public override fun style(style: IResolvable) {
      cdkBuilder.style(style.let(IResolvable::unwrap))
    }

    public override fun style(style: FormStyleProperty) {
      cdkBuilder.style(style.let(FormStyleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2634a16848ce7a3e78cc5d2160df60325ece2be95a5fa3ff0ba9456a1f0880ed")
    public override fun style(style: FormStyleProperty.Builder.() -> Unit): Unit =
        style(FormStyleProperty(style))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnForm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnForm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm): CfnForm
        = CfnForm(cdkObject)

    internal fun unwrap(wrapped: CfnForm): software.amazon.awscdk.services.amplifyuibuilder.CfnForm
        = wrapped.cdkObject
  }

  public interface FormStyleProperty {
    public fun horizontalGap(): Any? = unwrap(this).getHorizontalGap()

    public fun outerPadding(): Any? = unwrap(this).getOuterPadding()

    public fun verticalGap(): Any? = unwrap(this).getVerticalGap()

    public interface Builder {
      public fun horizontalGap(horizontalGap: IResolvable) {
      }

      public fun horizontalGap(horizontalGap: FormStyleConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8a12023b55a24b6429e79c0814ac53caaf170936f4d8368e65dff1446a4d3b6")
      public fun horizontalGap(horizontalGap: FormStyleConfigProperty.Builder.() -> Unit) {
      }

      public fun outerPadding(outerPadding: IResolvable) {
      }

      public fun outerPadding(outerPadding: FormStyleConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce45d7f38411ba695c26d1741ceb0e0d065e1c6077f4fd619309a3ca38008f19")
      public fun outerPadding(outerPadding: FormStyleConfigProperty.Builder.() -> Unit) {
      }

      public fun verticalGap(verticalGap: IResolvable) {
      }

      public fun verticalGap(verticalGap: FormStyleConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f105ff7e1666f9fc3e9461df44db047b2bf72dcd40425ca3d5e5224856a53e57")
      public fun verticalGap(verticalGap: FormStyleConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty.builder()

      public override fun horizontalGap(horizontalGap: IResolvable) {
        cdkBuilder.horizontalGap(horizontalGap.let(IResolvable::unwrap))
      }

      public override fun horizontalGap(horizontalGap: FormStyleConfigProperty) {
        cdkBuilder.horizontalGap(horizontalGap.let(FormStyleConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8a12023b55a24b6429e79c0814ac53caaf170936f4d8368e65dff1446a4d3b6")
      public override fun horizontalGap(horizontalGap: FormStyleConfigProperty.Builder.() -> Unit):
          Unit = horizontalGap(FormStyleConfigProperty(horizontalGap))

      public override fun outerPadding(outerPadding: IResolvable) {
        cdkBuilder.outerPadding(outerPadding.let(IResolvable::unwrap))
      }

      public override fun outerPadding(outerPadding: FormStyleConfigProperty) {
        cdkBuilder.outerPadding(outerPadding.let(FormStyleConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce45d7f38411ba695c26d1741ceb0e0d065e1c6077f4fd619309a3ca38008f19")
      public override fun outerPadding(outerPadding: FormStyleConfigProperty.Builder.() -> Unit):
          Unit = outerPadding(FormStyleConfigProperty(outerPadding))

      public override fun verticalGap(verticalGap: IResolvable) {
        cdkBuilder.verticalGap(verticalGap.let(IResolvable::unwrap))
      }

      public override fun verticalGap(verticalGap: FormStyleConfigProperty) {
        cdkBuilder.verticalGap(verticalGap.let(FormStyleConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f105ff7e1666f9fc3e9461df44db047b2bf72dcd40425ca3d5e5224856a53e57")
      public override fun verticalGap(verticalGap: FormStyleConfigProperty.Builder.() -> Unit): Unit
          = verticalGap(FormStyleConfigProperty(verticalGap))

      public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty,
    ) : FormStyleProperty {
      public override fun horizontalGap(): Any? = unwrap(this).getHorizontalGap()

      public override fun outerPadding(): Any? = unwrap(this).getOuterPadding()

      public override fun verticalGap(): Any? = unwrap(this).getVerticalGap()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormStyleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty):
          FormStyleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormStyleProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormInputValuePropertyProperty {
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    public fun concat(): Any? = unwrap(this).getConcat()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun bindingProperties(bindingProperties: IResolvable) {
      }

      public
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07939339dd165ac82ec59948a81aac59321a5986d4f3ed9a39e58c1b5f19abc")
      public
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty.Builder.() -> Unit) {
      }

      public fun concat(concat: IResolvable) {
      }

      public fun concat(concat: List<Any>) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty.builder()

      public override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      public override
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(FormInputValuePropertyBindingPropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07939339dd165ac82ec59948a81aac59321a5986d4f3ed9a39e58c1b5f19abc")
      public override
          fun bindingProperties(bindingProperties: FormInputValuePropertyBindingPropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(FormInputValuePropertyBindingPropertiesProperty(bindingProperties))

      public override fun concat(concat: IResolvable) {
        cdkBuilder.concat(concat.let(IResolvable::unwrap))
      }

      public override fun concat(concat: List<Any>) {
        cdkBuilder.concat(concat)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty,
    ) : FormInputValuePropertyProperty {
      public override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      public override fun concat(): Any? = unwrap(this).getConcat()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormInputValuePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty):
          FormInputValuePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputValuePropertyProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldValidationConfigurationProperty {
    public fun numValues(): Any? = unwrap(this).getNumValues()

    public fun strValues(): List<String> = unwrap(this).getStrValues() ?: emptyList()

    public fun type(): String

    public fun validationMessage(): String? = unwrap(this).getValidationMessage()

    public interface Builder {
      public fun numValues(numValues: IResolvable) {
      }

      public fun numValues(numValues: List<Number>) {
      }

      public fun strValues(strValues: List<String>) {
      }

      public fun type(type: String) {
      }

      public fun validationMessage(validationMessage: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty.builder()

      public override fun numValues(numValues: IResolvable) {
        cdkBuilder.numValues(numValues.let(IResolvable::unwrap))
      }

      public override fun numValues(numValues: List<Number>) {
        cdkBuilder.numValues(numValues)
      }

      public override fun strValues(strValues: List<String>) {
        cdkBuilder.strValues(strValues)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun validationMessage(validationMessage: String) {
        cdkBuilder.validationMessage(validationMessage)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty,
    ) : FieldValidationConfigurationProperty {
      public override fun numValues(): Any? = unwrap(this).getNumValues()

      public override fun strValues(): List<String> = unwrap(this).getStrValues() ?: emptyList()

      public override fun type(): String = unwrap(this).getType()

      public override fun validationMessage(): String? = unwrap(this).getValidationMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FieldValidationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty):
          FieldValidationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldValidationConfigurationProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldValidationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileUploaderFieldConfigProperty {
    public fun acceptedFileTypes(): List<String>

    public fun accessLevel(): String

    public fun isResumable(): Any? = unwrap(this).getIsResumable()

    public fun maxFileCount(): Number? = unwrap(this).getMaxFileCount()

    public fun maxSize(): Number? = unwrap(this).getMaxSize()

    public fun showThumbnails(): Any? = unwrap(this).getShowThumbnails()

    public interface Builder {
      public fun acceptedFileTypes(acceptedFileTypes: List<String>) {
      }

      public fun accessLevel(accessLevel: String) {
      }

      public fun isResumable(isResumable: Boolean) {
      }

      public fun isResumable(isResumable: IResolvable) {
      }

      public fun maxFileCount(maxFileCount: Number) {
      }

      public fun maxSize(maxSize: Number) {
      }

      public fun showThumbnails(showThumbnails: Boolean) {
      }

      public fun showThumbnails(showThumbnails: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty.builder()

      public override fun acceptedFileTypes(acceptedFileTypes: List<String>) {
        cdkBuilder.acceptedFileTypes(acceptedFileTypes)
      }

      public override fun accessLevel(accessLevel: String) {
        cdkBuilder.accessLevel(accessLevel)
      }

      public override fun isResumable(isResumable: Boolean) {
        cdkBuilder.isResumable(isResumable)
      }

      public override fun isResumable(isResumable: IResolvable) {
        cdkBuilder.isResumable(isResumable.let(IResolvable::unwrap))
      }

      public override fun maxFileCount(maxFileCount: Number) {
        cdkBuilder.maxFileCount(maxFileCount)
      }

      public override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      public override fun showThumbnails(showThumbnails: Boolean) {
        cdkBuilder.showThumbnails(showThumbnails)
      }

      public override fun showThumbnails(showThumbnails: IResolvable) {
        cdkBuilder.showThumbnails(showThumbnails.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty,
    ) : FileUploaderFieldConfigProperty {
      public override fun acceptedFileTypes(): List<String> = unwrap(this).getAcceptedFileTypes() ?:
          emptyList()

      public override fun accessLevel(): String = unwrap(this).getAccessLevel()

      public override fun isResumable(): Any? = unwrap(this).getIsResumable()

      public override fun maxFileCount(): Number? = unwrap(this).getMaxFileCount()

      public override fun maxSize(): Number? = unwrap(this).getMaxSize()

      public override fun showThumbnails(): Any? = unwrap(this).getShowThumbnails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileUploaderFieldConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty):
          FileUploaderFieldConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileUploaderFieldConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FileUploaderFieldConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormInputBindingPropertiesValueProperty {
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun bindingProperties(bindingProperties: IResolvable) {
      }

      public
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068d8d4bfa9fce6e7705c4e49fec73461aa875f27d186222db7d59a13f9c65ae")
      public
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty.builder()

      public override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      public override
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty) {
        cdkBuilder.bindingProperties(bindingProperties.let(FormInputBindingPropertiesValuePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("068d8d4bfa9fce6e7705c4e49fec73461aa875f27d186222db7d59a13f9c65ae")
      public override
          fun bindingProperties(bindingProperties: FormInputBindingPropertiesValuePropertiesProperty.Builder.() -> Unit):
          Unit =
          bindingProperties(FormInputBindingPropertiesValuePropertiesProperty(bindingProperties))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty,
    ) : FormInputBindingPropertiesValueProperty {
      public override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputBindingPropertiesValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty):
          FormInputBindingPropertiesValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputBindingPropertiesValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValueProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormCTAProperty {
    public fun cancel(): Any? = unwrap(this).getCancel()

    public fun clear(): Any? = unwrap(this).getClear()

    public fun position(): String? = unwrap(this).getPosition()

    public fun submit(): Any? = unwrap(this).getSubmit()

    public interface Builder {
      public fun cancel(cancel: IResolvable) {
      }

      public fun cancel(cancel: FormButtonProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e10ffc6077cfdea59b4b69d4aba771b4edabf72c7e985b24a609acb520ad0c29")
      public fun cancel(cancel: FormButtonProperty.Builder.() -> Unit) {
      }

      public fun clear(clear: IResolvable) {
      }

      public fun clear(clear: FormButtonProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2368f12872aac3777c653e431f7b0f7aec0c02dae3f26efd5c2947552f2c9f")
      public fun clear(clear: FormButtonProperty.Builder.() -> Unit) {
      }

      public fun position(position: String) {
      }

      public fun submit(submit: IResolvable) {
      }

      public fun submit(submit: FormButtonProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f04f26d3e185a85d2564ea012630e118c35b0d78826c61679dabad9da7f557")
      public fun submit(submit: FormButtonProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty.builder()

      public override fun cancel(cancel: IResolvable) {
        cdkBuilder.cancel(cancel.let(IResolvable::unwrap))
      }

      public override fun cancel(cancel: FormButtonProperty) {
        cdkBuilder.cancel(cancel.let(FormButtonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e10ffc6077cfdea59b4b69d4aba771b4edabf72c7e985b24a609acb520ad0c29")
      public override fun cancel(cancel: FormButtonProperty.Builder.() -> Unit): Unit =
          cancel(FormButtonProperty(cancel))

      public override fun clear(clear: IResolvable) {
        cdkBuilder.clear(clear.let(IResolvable::unwrap))
      }

      public override fun clear(clear: FormButtonProperty) {
        cdkBuilder.clear(clear.let(FormButtonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2368f12872aac3777c653e431f7b0f7aec0c02dae3f26efd5c2947552f2c9f")
      public override fun clear(clear: FormButtonProperty.Builder.() -> Unit): Unit =
          clear(FormButtonProperty(clear))

      public override fun position(position: String) {
        cdkBuilder.position(position)
      }

      public override fun submit(submit: IResolvable) {
        cdkBuilder.submit(submit.let(IResolvable::unwrap))
      }

      public override fun submit(submit: FormButtonProperty) {
        cdkBuilder.submit(submit.let(FormButtonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32f04f26d3e185a85d2564ea012630e118c35b0d78826c61679dabad9da7f557")
      public override fun submit(submit: FormButtonProperty.Builder.() -> Unit): Unit =
          submit(FormButtonProperty(submit))

      public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty,
    ) : FormCTAProperty {
      public override fun cancel(): Any? = unwrap(this).getCancel()

      public override fun clear(): Any? = unwrap(this).getClear()

      public override fun position(): String? = unwrap(this).getPosition()

      public override fun submit(): Any? = unwrap(this).getSubmit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormCTAProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty):
          FormCTAProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormCTAProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormCTAProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormInputValuePropertyBindingPropertiesProperty {
    public fun `field`(): String? = unwrap(this).getField()

    public fun `property`(): String

    public interface Builder {
      public fun `field`(`field`: String) {
      }

      public fun `property`(`property`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty.builder()

      public override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      public override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty,
    ) : FormInputValuePropertyBindingPropertiesProperty {
      public override fun `field`(): String? = unwrap(this).getField()

      public override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputValuePropertyBindingPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty):
          FormInputValuePropertyBindingPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputValuePropertyBindingPropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputValuePropertyBindingPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormButtonProperty {
    public fun children(): String? = unwrap(this).getChildren()

    public fun excluded(): Any? = unwrap(this).getExcluded()

    public fun position(): Any? = unwrap(this).getPosition()

    public interface Builder {
      public fun children(children: String) {
      }

      public fun excluded(excluded: Boolean) {
      }

      public fun excluded(excluded: IResolvable) {
      }

      public fun position(position: IResolvable) {
      }

      public fun position(position: FieldPositionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dd5d47f0a18ebc35782bbd119ab231637ce6f836228b583012f274916f67995")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty.builder()

      public override fun children(children: String) {
        cdkBuilder.children(children)
      }

      public override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      public override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      public override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      public override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dd5d47f0a18ebc35782bbd119ab231637ce6f836228b583012f274916f67995")
      public override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty,
    ) : FormButtonProperty {
      public override fun children(): String? = unwrap(this).getChildren()

      public override fun excluded(): Any? = unwrap(this).getExcluded()

      public override fun position(): Any? = unwrap(this).getPosition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty):
          FormButtonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormButtonProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormButtonProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FormStyleConfigProperty {
    public fun tokenReference(): String? = unwrap(this).getTokenReference()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun tokenReference(tokenReference: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty.builder()

      public override fun tokenReference(tokenReference: String) {
        cdkBuilder.tokenReference(tokenReference)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty,
    ) : FormStyleConfigProperty {
      public override fun tokenReference(): String? = unwrap(this).getTokenReference()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormStyleConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty):
          FormStyleConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormStyleConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormStyleConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldInputConfigProperty {
    public fun defaultChecked(): Any? = unwrap(this).getDefaultChecked()

    public fun defaultCountryCode(): String? = unwrap(this).getDefaultCountryCode()

    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun descriptiveText(): String? = unwrap(this).getDescriptiveText()

    public fun fileUploaderConfig(): Any? = unwrap(this).getFileUploaderConfig()

    public fun isArray(): Any? = unwrap(this).getIsArray()

    public fun maxValue(): Number? = unwrap(this).getMaxValue()

    public fun minValue(): Number? = unwrap(this).getMinValue()

    public fun name(): String? = unwrap(this).getName()

    public fun placeholder(): String? = unwrap(this).getPlaceholder()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun required(): Any? = unwrap(this).getRequired()

    public fun step(): Number? = unwrap(this).getStep()

    public fun type(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public fun valueMappings(): Any? = unwrap(this).getValueMappings()

    public interface Builder {
      public fun defaultChecked(defaultChecked: Boolean) {
      }

      public fun defaultChecked(defaultChecked: IResolvable) {
      }

      public fun defaultCountryCode(defaultCountryCode: String) {
      }

      public fun defaultValue(defaultValue: String) {
      }

      public fun descriptiveText(descriptiveText: String) {
      }

      public fun fileUploaderConfig(fileUploaderConfig: IResolvable) {
      }

      public fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d72304510be7d4f339609e15528c03a344679c2b87ce1714ad3f07bb096ea0c9")
      public
          fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty.Builder.() -> Unit) {
      }

      public fun isArray(isArray: Boolean) {
      }

      public fun isArray(isArray: IResolvable) {
      }

      public fun maxValue(maxValue: Number) {
      }

      public fun minValue(minValue: Number) {
      }

      public fun name(name: String) {
      }

      public fun placeholder(placeholder: String) {
      }

      public fun readOnly(readOnly: Boolean) {
      }

      public fun readOnly(readOnly: IResolvable) {
      }

      public fun required(required: Boolean) {
      }

      public fun required(required: IResolvable) {
      }

      public fun step(step: Number) {
      }

      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }

      public fun valueMappings(valueMappings: IResolvable) {
      }

      public fun valueMappings(valueMappings: ValueMappingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24dc45d8d1e745487188d349d0ad4e6938c2c88ccad6784f1ce749cc82d20433")
      public fun valueMappings(valueMappings: ValueMappingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty.builder()

      public override fun defaultChecked(defaultChecked: Boolean) {
        cdkBuilder.defaultChecked(defaultChecked)
      }

      public override fun defaultChecked(defaultChecked: IResolvable) {
        cdkBuilder.defaultChecked(defaultChecked.let(IResolvable::unwrap))
      }

      public override fun defaultCountryCode(defaultCountryCode: String) {
        cdkBuilder.defaultCountryCode(defaultCountryCode)
      }

      public override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public override fun descriptiveText(descriptiveText: String) {
        cdkBuilder.descriptiveText(descriptiveText)
      }

      public override fun fileUploaderConfig(fileUploaderConfig: IResolvable) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig.let(IResolvable::unwrap))
      }

      public override fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig.let(FileUploaderFieldConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d72304510be7d4f339609e15528c03a344679c2b87ce1714ad3f07bb096ea0c9")
      public override
          fun fileUploaderConfig(fileUploaderConfig: FileUploaderFieldConfigProperty.Builder.() -> Unit):
          Unit = fileUploaderConfig(FileUploaderFieldConfigProperty(fileUploaderConfig))

      public override fun isArray(isArray: Boolean) {
        cdkBuilder.isArray(isArray)
      }

      public override fun isArray(isArray: IResolvable) {
        cdkBuilder.isArray(isArray.let(IResolvable::unwrap))
      }

      public override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      public override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun placeholder(placeholder: String) {
        cdkBuilder.placeholder(placeholder)
      }

      public override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      public override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      public override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public override fun step(step: Number) {
        cdkBuilder.step(step)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public override fun valueMappings(valueMappings: IResolvable) {
        cdkBuilder.valueMappings(valueMappings.let(IResolvable::unwrap))
      }

      public override fun valueMappings(valueMappings: ValueMappingsProperty) {
        cdkBuilder.valueMappings(valueMappings.let(ValueMappingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("24dc45d8d1e745487188d349d0ad4e6938c2c88ccad6784f1ce749cc82d20433")
      public override fun valueMappings(valueMappings: ValueMappingsProperty.Builder.() -> Unit):
          Unit = valueMappings(ValueMappingsProperty(valueMappings))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty,
    ) : FieldInputConfigProperty {
      public override fun defaultChecked(): Any? = unwrap(this).getDefaultChecked()

      public override fun defaultCountryCode(): String? = unwrap(this).getDefaultCountryCode()

      public override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      public override fun descriptiveText(): String? = unwrap(this).getDescriptiveText()

      public override fun fileUploaderConfig(): Any? = unwrap(this).getFileUploaderConfig()

      public override fun isArray(): Any? = unwrap(this).getIsArray()

      public override fun maxValue(): Number? = unwrap(this).getMaxValue()

      public override fun minValue(): Number? = unwrap(this).getMinValue()

      public override fun name(): String? = unwrap(this).getName()

      public override fun placeholder(): String? = unwrap(this).getPlaceholder()

      public override fun readOnly(): Any? = unwrap(this).getReadOnly()

      public override fun required(): Any? = unwrap(this).getRequired()

      public override fun step(): Number? = unwrap(this).getStep()

      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String? = unwrap(this).getValue()

      public override fun valueMappings(): Any? = unwrap(this).getValueMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldInputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty):
          FieldInputConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldInputConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldInputConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SectionalElementProperty {
    public fun excluded(): Any? = unwrap(this).getExcluded()

    public fun level(): Number? = unwrap(this).getLevel()

    public fun orientation(): String? = unwrap(this).getOrientation()

    public fun position(): Any? = unwrap(this).getPosition()

    public fun text(): String? = unwrap(this).getText()

    public fun type(): String

    public interface Builder {
      public fun excluded(excluded: Boolean) {
      }

      public fun excluded(excluded: IResolvable) {
      }

      public fun level(level: Number) {
      }

      public fun orientation(orientation: String) {
      }

      public fun position(position: IResolvable) {
      }

      public fun position(position: FieldPositionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29f5995b373681bbb8afd12257b52048879f0802b7450f689680aa8c60c76bea")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit) {
      }

      public fun text(text: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty.builder()

      public override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      public override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      public override fun level(level: Number) {
        cdkBuilder.level(level)
      }

      public override fun orientation(orientation: String) {
        cdkBuilder.orientation(orientation)
      }

      public override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      public override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29f5995b373681bbb8afd12257b52048879f0802b7450f689680aa8c60c76bea")
      public override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      public override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty,
    ) : SectionalElementProperty {
      public override fun excluded(): Any? = unwrap(this).getExcluded()

      public override fun level(): Number? = unwrap(this).getLevel()

      public override fun orientation(): String? = unwrap(this).getOrientation()

      public override fun position(): Any? = unwrap(this).getPosition()

      public override fun text(): String? = unwrap(this).getText()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SectionalElementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty):
          SectionalElementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SectionalElementProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.SectionalElementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormInputBindingPropertiesValuePropertiesProperty {
    public fun model(): String? = unwrap(this).getModel()

    public interface Builder {
      public fun model(model: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty.builder()

      public override fun model(model: String) {
        cdkBuilder.model(model)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty,
    ) : FormInputBindingPropertiesValuePropertiesProperty {
      public override fun model(): String? = unwrap(this).getModel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FormInputBindingPropertiesValuePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty):
          FormInputBindingPropertiesValuePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputBindingPropertiesValuePropertiesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormInputBindingPropertiesValuePropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormDataTypeConfigProperty {
    public fun dataSourceType(): String

    public fun dataTypeName(): String

    public interface Builder {
      public fun dataSourceType(dataSourceType: String) {
      }

      public fun dataTypeName(dataTypeName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty.builder()

      public override fun dataSourceType(dataSourceType: String) {
        cdkBuilder.dataSourceType(dataSourceType)
      }

      public override fun dataTypeName(dataTypeName: String) {
        cdkBuilder.dataTypeName(dataTypeName)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty,
    ) : FormDataTypeConfigProperty {
      public override fun dataSourceType(): String = unwrap(this).getDataSourceType()

      public override fun dataTypeName(): String = unwrap(this).getDataTypeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormDataTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty):
          FormDataTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormDataTypeConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FormDataTypeConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldPositionProperty {
    public fun below(): String? = unwrap(this).getBelow()

    public fun fixed(): String? = unwrap(this).getFixed()

    public fun rightOf(): String? = unwrap(this).getRightOf()

    public interface Builder {
      public fun below(below: String) {
      }

      public fun fixed(fixed: String) {
      }

      public fun rightOf(rightOf: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty.builder()

      public override fun below(below: String) {
        cdkBuilder.below(below)
      }

      public override fun fixed(fixed: String) {
        cdkBuilder.fixed(fixed)
      }

      public override fun rightOf(rightOf: String) {
        cdkBuilder.rightOf(rightOf)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty,
    ) : FieldPositionProperty {
      public override fun below(): String? = unwrap(this).getBelow()

      public override fun fixed(): String? = unwrap(this).getFixed()

      public override fun rightOf(): String? = unwrap(this).getRightOf()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldPositionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty):
          FieldPositionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldPositionProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldPositionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ValueMappingsProperty {
    public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    public fun values(): Any

    public interface Builder {
      public fun bindingProperties(bindingProperties: IResolvable) {
      }

      public fun bindingProperties(bindingProperties: Map<String, Any>) {
      }

      public fun values(values: IResolvable) {
      }

      public fun values(values: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty.builder()

      public override fun bindingProperties(bindingProperties: IResolvable) {
        cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
      }

      public override fun bindingProperties(bindingProperties: Map<String, Any>) {
        cdkBuilder.bindingProperties(bindingProperties)
      }

      public override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable::unwrap))
      }

      public override fun values(values: List<Any>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty,
    ) : ValueMappingsProperty {
      public override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

      public override fun values(): Any = unwrap(this).getValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValueMappingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty):
          ValueMappingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValueMappingsProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FieldConfigProperty {
    public fun excluded(): Any? = unwrap(this).getExcluded()

    public fun inputType(): Any? = unwrap(this).getInputType()

    public fun label(): String? = unwrap(this).getLabel()

    public fun position(): Any? = unwrap(this).getPosition()

    public fun validations(): Any? = unwrap(this).getValidations()

    public interface Builder {
      public fun excluded(excluded: Boolean) {
      }

      public fun excluded(excluded: IResolvable) {
      }

      public fun inputType(inputType: IResolvable) {
      }

      public fun inputType(inputType: FieldInputConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64032d2e345e9547d0f3723ea7d0e92e4b928e6587669dd5bb3f6dc3742b141")
      public fun inputType(inputType: FieldInputConfigProperty.Builder.() -> Unit) {
      }

      public fun label(label: String) {
      }

      public fun position(position: IResolvable) {
      }

      public fun position(position: FieldPositionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d0acb41da5497eb76185a9fa1f05138d22a493616d0de6fdae657e8289e1d15")
      public fun position(position: FieldPositionProperty.Builder.() -> Unit) {
      }

      public fun validations(validations: IResolvable) {
      }

      public fun validations(validations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty.builder()

      public override fun excluded(excluded: Boolean) {
        cdkBuilder.excluded(excluded)
      }

      public override fun excluded(excluded: IResolvable) {
        cdkBuilder.excluded(excluded.let(IResolvable::unwrap))
      }

      public override fun inputType(inputType: IResolvable) {
        cdkBuilder.inputType(inputType.let(IResolvable::unwrap))
      }

      public override fun inputType(inputType: FieldInputConfigProperty) {
        cdkBuilder.inputType(inputType.let(FieldInputConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c64032d2e345e9547d0f3723ea7d0e92e4b928e6587669dd5bb3f6dc3742b141")
      public override fun inputType(inputType: FieldInputConfigProperty.Builder.() -> Unit): Unit =
          inputType(FieldInputConfigProperty(inputType))

      public override fun label(label: String) {
        cdkBuilder.label(label)
      }

      public override fun position(position: IResolvable) {
        cdkBuilder.position(position.let(IResolvable::unwrap))
      }

      public override fun position(position: FieldPositionProperty) {
        cdkBuilder.position(position.let(FieldPositionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d0acb41da5497eb76185a9fa1f05138d22a493616d0de6fdae657e8289e1d15")
      public override fun position(position: FieldPositionProperty.Builder.() -> Unit): Unit =
          position(FieldPositionProperty(position))

      public override fun validations(validations: IResolvable) {
        cdkBuilder.validations(validations.let(IResolvable::unwrap))
      }

      public override fun validations(validations: List<Any>) {
        cdkBuilder.validations(validations)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty,
    ) : FieldConfigProperty {
      public override fun excluded(): Any? = unwrap(this).getExcluded()

      public override fun inputType(): Any? = unwrap(this).getInputType()

      public override fun label(): String? = unwrap(this).getLabel()

      public override fun position(): Any? = unwrap(this).getPosition()

      public override fun validations(): Any? = unwrap(this).getValidations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty):
          FieldConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldConfigProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.FieldConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ValueMappingProperty {
    public fun displayValue(): Any? = unwrap(this).getDisplayValue()

    public fun `value`(): Any

    public interface Builder {
      public fun displayValue(displayValue: IResolvable) {
      }

      public fun displayValue(displayValue: FormInputValuePropertyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d66ecd117a0518e7526fb410cb6fd154848ed15171575daf97d7c89f93274")
      public fun displayValue(displayValue: FormInputValuePropertyProperty.Builder.() -> Unit) {
      }

      public fun `value`(`value`: IResolvable) {
      }

      public fun `value`(`value`: FormInputValuePropertyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d5251c5427e224c5f176efeba18536c54d33b5366e834e5700aa70bcb9ebc2a")
      public fun `value`(`value`: FormInputValuePropertyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty.builder()

      public override fun displayValue(displayValue: IResolvable) {
        cdkBuilder.displayValue(displayValue.let(IResolvable::unwrap))
      }

      public override fun displayValue(displayValue: FormInputValuePropertyProperty) {
        cdkBuilder.displayValue(displayValue.let(FormInputValuePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d66ecd117a0518e7526fb410cb6fd154848ed15171575daf97d7c89f93274")
      public override
          fun displayValue(displayValue: FormInputValuePropertyProperty.Builder.() -> Unit): Unit =
          displayValue(FormInputValuePropertyProperty(displayValue))

      public override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      public override fun `value`(`value`: FormInputValuePropertyProperty) {
        cdkBuilder.`value`(`value`.let(FormInputValuePropertyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d5251c5427e224c5f176efeba18536c54d33b5366e834e5700aa70bcb9ebc2a")
      public override fun `value`(`value`: FormInputValuePropertyProperty.Builder.() -> Unit): Unit
          = `value`(FormInputValuePropertyProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty,
    ) : ValueMappingProperty {
      public override fun displayValue(): Any? = unwrap(this).getDisplayValue()

      public override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValueMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty):
          ValueMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValueMappingProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnForm.ValueMappingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
