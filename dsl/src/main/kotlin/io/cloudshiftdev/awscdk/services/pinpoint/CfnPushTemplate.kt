package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPushTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun adm(): Any? = unwrap(this).getAdm()

  public open fun adm(`value`: IResolvable) {
    unwrap(this).setAdm(`value`.let(IResolvable::unwrap))
  }

  public open fun adm(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setAdm(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eed3a20e717391ab5658b831e90da84d5355e14108319e838487174a600cdfde")
  public open fun adm(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      adm(AndroidPushNotificationTemplateProperty(`value`))

  public open fun apns(): Any? = unwrap(this).getApns()

  public open fun apns(`value`: IResolvable) {
    unwrap(this).setApns(`value`.let(IResolvable::unwrap))
  }

  public open fun apns(`value`: APNSPushNotificationTemplateProperty) {
    unwrap(this).setApns(`value`.let(APNSPushNotificationTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ad4a6a4610a7e3a8656d2046a0ad3e6c7081860e2adc31a8878606945b1615a")
  public open fun apns(`value`: APNSPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      apns(APNSPushNotificationTemplateProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun baidu(): Any? = unwrap(this).getBaidu()

  public open fun baidu(`value`: IResolvable) {
    unwrap(this).setBaidu(`value`.let(IResolvable::unwrap))
  }

  public open fun baidu(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setBaidu(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80a8b5508ce69984be81bd07da037946307620f8ef133d2e60f9cdbccd66ca84")
  public open fun baidu(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      baidu(AndroidPushNotificationTemplateProperty(`value`))

  public open fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  public open fun defaultSubstitutions(`value`: String) {
    unwrap(this).setDefaultSubstitutions(`value`)
  }

  public open fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  public open fun defaultValue(`value`: IResolvable) {
    unwrap(this).setDefaultValue(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultValue(`value`: DefaultPushNotificationTemplateProperty) {
    unwrap(this).setDefaultValue(`value`.let(DefaultPushNotificationTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df2cad8caa72232a99237c6fb9f7f643d3e480414e76742b9ae7e069286f76dc")
  public open fun defaultValue(`value`: DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
      Unit = defaultValue(DefaultPushNotificationTemplateProperty(`value`))

  public open fun gcm(): Any? = unwrap(this).getGcm()

  public open fun gcm(`value`: IResolvable) {
    unwrap(this).setGcm(`value`.let(IResolvable::unwrap))
  }

  public open fun gcm(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setGcm(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16cfa5ea489598eee94b863507b16e0e23cb8c52d0b26cb5107656703275580e")
  public open fun gcm(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      gcm(AndroidPushNotificationTemplateProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    public fun adm(adm: IResolvable)

    public fun adm(adm: AndroidPushNotificationTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8736366f826fa0836f98e7a8e80e2c65765a4cae20b41ac956584a4aabd373e9")
    public fun adm(adm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun apns(apns: IResolvable)

    public fun apns(apns: APNSPushNotificationTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6067c22e38a120431f1532d54a94bf205ebfc2c03c6477a9a85f487751c2227")
    public fun apns(apns: APNSPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun baidu(baidu: IResolvable)

    public fun baidu(baidu: AndroidPushNotificationTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc694eece0399854bffddc89d3dbd2d5a139541583ffe80e340afa48420aa17d")
    public fun baidu(baidu: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun defaultSubstitutions(defaultSubstitutions: String)

    public fun defaultValue(defaultValue: IResolvable)

    public fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405c89e1287eef14060f58aac5cd607ec014bc5df4ea14ee5bc8927aa537d9e3")
    public
        fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun gcm(gcm: IResolvable)

    public fun gcm(gcm: AndroidPushNotificationTemplateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703a749ec0a76a9c29c8ea53fe8c0b07876271194c7561f4d225d88d9cb8ab2a")
    public fun gcm(gcm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnPushTemplate.Builder.create(scope, id)

    override fun adm(adm: IResolvable) {
      cdkBuilder.adm(adm.let(IResolvable::unwrap))
    }

    override fun adm(adm: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.adm(adm.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8736366f826fa0836f98e7a8e80e2c65765a4cae20b41ac956584a4aabd373e9")
    override fun adm(adm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        adm(AndroidPushNotificationTemplateProperty(adm))

    override fun apns(apns: IResolvable) {
      cdkBuilder.apns(apns.let(IResolvable::unwrap))
    }

    override fun apns(apns: APNSPushNotificationTemplateProperty) {
      cdkBuilder.apns(apns.let(APNSPushNotificationTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6067c22e38a120431f1532d54a94bf205ebfc2c03c6477a9a85f487751c2227")
    override fun apns(apns: APNSPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        apns(APNSPushNotificationTemplateProperty(apns))

    override fun baidu(baidu: IResolvable) {
      cdkBuilder.baidu(baidu.let(IResolvable::unwrap))
    }

    override fun baidu(baidu: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.baidu(baidu.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc694eece0399854bffddc89d3dbd2d5a139541583ffe80e340afa48420aa17d")
    override fun baidu(baidu: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        baidu(AndroidPushNotificationTemplateProperty(baidu))

    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    override fun defaultValue(defaultValue: IResolvable) {
      cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
    }

    override fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty) {
      cdkBuilder.defaultValue(defaultValue.let(DefaultPushNotificationTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405c89e1287eef14060f58aac5cd607ec014bc5df4ea14ee5bc8927aa537d9e3")
    override
        fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = defaultValue(DefaultPushNotificationTemplateProperty(defaultValue))

    override fun gcm(gcm: IResolvable) {
      cdkBuilder.gcm(gcm.let(IResolvable::unwrap))
    }

    override fun gcm(gcm: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.gcm(gcm.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703a749ec0a76a9c29c8ea53fe8c0b07876271194c7561f4d225d88d9cb8ab2a")
    override fun gcm(gcm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        gcm(AndroidPushNotificationTemplateProperty(gcm))

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnPushTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPushTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPushTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate):
        CfnPushTemplate = CfnPushTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnPushTemplate):
        software.amazon.awscdk.services.pinpoint.CfnPushTemplate = wrapped.cdkObject
  }

  public interface DefaultPushNotificationTemplateProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun body(): String? = unwrap(this).getBody()

    public fun sound(): String? = unwrap(this).getSound()

    public fun title(): String? = unwrap(this).getTitle()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun action(action: String)

      public fun body(body: String)

      public fun sound(sound: String)

      public fun title(title: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty,
    ) : DefaultPushNotificationTemplateProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun body(): String? = unwrap(this).getBody()

      override fun sound(): String? = unwrap(this).getSound()

      override fun title(): String? = unwrap(this).getTitle()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty):
          DefaultPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AndroidPushNotificationTemplateProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun body(): String? = unwrap(this).getBody()

    public fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    public fun smallImageIconUrl(): String? = unwrap(this).getSmallImageIconUrl()

    public fun sound(): String? = unwrap(this).getSound()

    public fun title(): String? = unwrap(this).getTitle()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun action(action: String)

      public fun body(body: String)

      public fun imageIconUrl(imageIconUrl: String)

      public fun imageUrl(imageUrl: String)

      public fun smallImageIconUrl(smallImageIconUrl: String)

      public fun sound(sound: String)

      public fun title(title: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
      }

      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      override fun smallImageIconUrl(smallImageIconUrl: String) {
        cdkBuilder.smallImageIconUrl(smallImageIconUrl)
      }

      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty,
    ) : AndroidPushNotificationTemplateProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun body(): String? = unwrap(this).getBody()

      override fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      override fun smallImageIconUrl(): String? = unwrap(this).getSmallImageIconUrl()

      override fun sound(): String? = unwrap(this).getSound()

      override fun title(): String? = unwrap(this).getTitle()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AndroidPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty):
          AndroidPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndroidPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface APNSPushNotificationTemplateProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun body(): String? = unwrap(this).getBody()

    public fun mediaUrl(): String? = unwrap(this).getMediaUrl()

    public fun sound(): String? = unwrap(this).getSound()

    public fun title(): String? = unwrap(this).getTitle()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun action(action: String)

      public fun body(body: String)

      public fun mediaUrl(mediaUrl: String)

      public fun sound(sound: String)

      public fun title(title: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
      }

      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty,
    ) : APNSPushNotificationTemplateProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun body(): String? = unwrap(this).getBody()

      override fun mediaUrl(): String? = unwrap(this).getMediaUrl()

      override fun sound(): String? = unwrap(this).getSound()

      override fun title(): String? = unwrap(this).getTitle()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          APNSPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty):
          APNSPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: APNSPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
