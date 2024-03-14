package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInAppTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun content(): Any? = unwrap(this).getContent()

  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  public open fun content(__idx_ac66f0: List<Any>) {
    unwrap(this).setContent(__idx_ac66f0)
  }

  public open fun content(vararg __idx_ac66f0: Any): Unit = content(__idx_ac66f0.toList())

  public open fun customConfig(): Any? = unwrap(this).getCustomConfig()

  public open fun customConfig(`value`: Any) {
    unwrap(this).setCustomConfig(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun layout(): String? = unwrap(this).getLayout()

  public open fun layout(`value`: String) {
    unwrap(this).setLayout(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public open fun templateDescription(`value`: String) {
    unwrap(this).setTemplateDescription(`value`)
  }

  public open fun templateName(): String = unwrap(this).getTemplateName()

  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  public interface Builder {
    public fun content(content: IResolvable)

    public fun content(content: List<Any>)

    public fun content(vararg content: Any)

    public fun customConfig(customConfig: Any)

    public fun layout(layout: String)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.Builder.create(scope, id)

    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    override fun content(content: List<Any>) {
      cdkBuilder.content(content)
    }

    override fun content(vararg content: Any): Unit = content(content.toList())

    override fun customConfig(customConfig: Any) {
      cdkBuilder.customConfig(customConfig)
    }

    override fun layout(layout: String) {
      cdkBuilder.layout(layout)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInAppTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInAppTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate):
        CfnInAppTemplate = CfnInAppTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnInAppTemplate):
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplate = wrapped.cdkObject
  }

  public interface InAppMessageContentProperty {
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

    public fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    public fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

    public fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()

    public interface Builder {
      public fun backgroundColor(backgroundColor: String)

      public fun bodyConfig(bodyConfig: IResolvable)

      public fun bodyConfig(bodyConfig: BodyConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2479de21a04690559cc4670eb0c9d6482bde68d7f4a47b3efc0ae67e5488d597")
      public fun bodyConfig(bodyConfig: BodyConfigProperty.Builder.() -> Unit)

      public fun headerConfig(headerConfig: IResolvable)

      public fun headerConfig(headerConfig: HeaderConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365e1110395eb940721a86faf9af727ac6d8d774c85cc42f0734c6396c8df06e")
      public fun headerConfig(headerConfig: HeaderConfigProperty.Builder.() -> Unit)

      public fun imageUrl(imageUrl: String)

      public fun primaryBtn(primaryBtn: IResolvable)

      public fun primaryBtn(primaryBtn: ButtonConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e55e629d616959e6e36a18e1a6ad549e12fc5337eb4dbef59eda51ef08e1dd1d")
      public fun primaryBtn(primaryBtn: ButtonConfigProperty.Builder.() -> Unit)

      public fun secondaryBtn(secondaryBtn: IResolvable)

      public fun secondaryBtn(secondaryBtn: ButtonConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234b6b86f473b96be475830f85312730a4e7b77a6dab32954fbbbd839e24d313")
      public fun secondaryBtn(secondaryBtn: ButtonConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty.builder()

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig.let(IResolvable::unwrap))
      }

      override fun bodyConfig(bodyConfig: BodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig.let(BodyConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2479de21a04690559cc4670eb0c9d6482bde68d7f4a47b3efc0ae67e5488d597")
      override fun bodyConfig(bodyConfig: BodyConfigProperty.Builder.() -> Unit): Unit =
          bodyConfig(BodyConfigProperty(bodyConfig))

      override fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig.let(IResolvable::unwrap))
      }

      override fun headerConfig(headerConfig: HeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig.let(HeaderConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365e1110395eb940721a86faf9af727ac6d8d774c85cc42f0734c6396c8df06e")
      override fun headerConfig(headerConfig: HeaderConfigProperty.Builder.() -> Unit): Unit =
          headerConfig(HeaderConfigProperty(headerConfig))

      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      override fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn.let(IResolvable::unwrap))
      }

      override fun primaryBtn(primaryBtn: ButtonConfigProperty) {
        cdkBuilder.primaryBtn(primaryBtn.let(ButtonConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e55e629d616959e6e36a18e1a6ad549e12fc5337eb4dbef59eda51ef08e1dd1d")
      override fun primaryBtn(primaryBtn: ButtonConfigProperty.Builder.() -> Unit): Unit =
          primaryBtn(ButtonConfigProperty(primaryBtn))

      override fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(IResolvable::unwrap))
      }

      override fun secondaryBtn(secondaryBtn: ButtonConfigProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(ButtonConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234b6b86f473b96be475830f85312730a4e7b77a6dab32954fbbbd839e24d313")
      override fun secondaryBtn(secondaryBtn: ButtonConfigProperty.Builder.() -> Unit): Unit =
          secondaryBtn(ButtonConfigProperty(secondaryBtn))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty,
    ) : InAppMessageContentProperty {
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

      override fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      override fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

      override fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty):
          InAppMessageContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageContentProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BodyConfigProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun body(): String? = unwrap(this).getBody()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun alignment(alignment: String)

      public fun body(body: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty,
    ) : BodyConfigProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun body(): String? = unwrap(this).getBody()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BodyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty):
          BodyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BodyConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultButtonConfigurationProperty {
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun borderRadius(): Number? = unwrap(this).getBorderRadius()

    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    public fun link(): String? = unwrap(this).getLink()

    public fun text(): String? = unwrap(this).getText()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun backgroundColor(backgroundColor: String)

      public fun borderRadius(borderRadius: Number)

      public fun buttonAction(buttonAction: String)

      public fun link(link: String)

      public fun text(text: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty.builder()

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun borderRadius(borderRadius: Number) {
        cdkBuilder.borderRadius(borderRadius)
      }

      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty,
    ) : DefaultButtonConfigurationProperty {
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun borderRadius(): Number? = unwrap(this).getBorderRadius()

      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      override fun link(): String? = unwrap(this).getLink()

      override fun text(): String? = unwrap(this).getText()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty):
          DefaultButtonConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OverrideButtonConfigurationProperty {
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    public fun link(): String? = unwrap(this).getLink()

    public interface Builder {
      public fun buttonAction(buttonAction: String)

      public fun link(link: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty.builder()

      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty,
    ) : OverrideButtonConfigurationProperty {
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      override fun link(): String? = unwrap(this).getLink()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty):
          OverrideButtonConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HeaderConfigProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun `header`(): String? = unwrap(this).getHeader()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun alignment(alignment: String)

      public fun `header`(`header`: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty,
    ) : HeaderConfigProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun `header`(): String? = unwrap(this).getHeader()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty):
          HeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ButtonConfigProperty {
    public fun android(): Any? = unwrap(this).getAndroid()

    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    public fun ios(): Any? = unwrap(this).getIos()

    public fun web(): Any? = unwrap(this).getWeb()

    public interface Builder {
      public fun android(android: IResolvable)

      public fun android(android: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88a38b25b4684566e7079a422699d84fd408979eb8cfb373aec91408a4e9bcd6")
      public fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      public fun defaultConfig(defaultConfig: IResolvable)

      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b26fb3703b3caf476965cf7702f104885ef6807115a346f49bace39d5bac9")
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit)

      public fun ios(ios: IResolvable)

      public fun ios(ios: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aea58ea9a80bca6bf68327d5ce114eee486702e9606d34ca4290f7daa88296")
      public fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      public fun web(web: IResolvable)

      public fun web(web: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ad297153e0dea8130af040c61521e27aff5bf44f0addd08ce7d1876021523")
      public fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty.builder()

      override fun android(android: IResolvable) {
        cdkBuilder.android(android.let(IResolvable::unwrap))
      }

      override fun android(android: OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88a38b25b4684566e7079a422699d84fd408979eb8cfb373aec91408a4e9bcd6")
      override fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          android(OverrideButtonConfigurationProperty(android))

      override fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
      }

      override fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b26fb3703b3caf476965cf7702f104885ef6807115a346f49bace39d5bac9")
      override
          fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit):
          Unit = defaultConfig(DefaultButtonConfigurationProperty(defaultConfig))

      override fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios.let(IResolvable::unwrap))
      }

      override fun ios(ios: OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aea58ea9a80bca6bf68327d5ce114eee486702e9606d34ca4290f7daa88296")
      override fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          ios(OverrideButtonConfigurationProperty(ios))

      override fun web(web: IResolvable) {
        cdkBuilder.web(web.let(IResolvable::unwrap))
      }

      override fun web(web: OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ad297153e0dea8130af040c61521e27aff5bf44f0addd08ce7d1876021523")
      override fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          web(OverrideButtonConfigurationProperty(web))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty,
    ) : ButtonConfigProperty {
      override fun android(): Any? = unwrap(this).getAndroid()

      override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      override fun ios(): Any? = unwrap(this).getIos()

      override fun web(): Any? = unwrap(this).getWeb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ButtonConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty):
          ButtonConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ButtonConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
