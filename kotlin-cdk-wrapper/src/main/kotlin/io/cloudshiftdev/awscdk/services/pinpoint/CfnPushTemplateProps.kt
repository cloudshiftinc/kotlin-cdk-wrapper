@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPushTemplateProps {
  public fun adm(): Any? = unwrap(this).getAdm()

  public fun apns(): Any? = unwrap(this).getApns()

  public fun baidu(): Any? = unwrap(this).getBaidu()

  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  public fun gcm(): Any? = unwrap(this).getGcm()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  public fun templateName(): String

  @CdkDslMarker
  public interface Builder {
    public fun adm(adm: IResolvable)

    public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b95a5cc9a26ee4236f57589353c12efa7d4689b7333b1164940dce415244f7fe")
    public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun apns(apns: IResolvable)

    public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140fe6aaa3b7fcedb1514f88b9eed4f44f6e4ce11f306c55a26909382e8253e8")
    public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun baidu(baidu: IResolvable)

    public fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7891851045ad24b6beddf38bca495a87e2e09fa66092605aa695058504c584ad")
    public
        fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun defaultSubstitutions(defaultSubstitutions: String)

    public fun defaultValue(defaultValue: IResolvable)

    public fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b17775c310d8a9a49630ab206f326aa7edb82f87db0145dceda18ac73b81fa")
    public
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun gcm(gcm: IResolvable)

    public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9f8a4b02a981bf8d3f22c523e365181ff7a689420b198807a43963e762bcecb")
    public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    public fun tags(tags: Any)

    public fun templateDescription(templateDescription: String)

    public fun templateName(templateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps.builder()

    override fun adm(adm: IResolvable) {
      cdkBuilder.adm(adm.let(IResolvable::unwrap))
    }

    override fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.adm(adm.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b95a5cc9a26ee4236f57589353c12efa7d4689b7333b1164940dce415244f7fe")
    override
        fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = adm(CfnPushTemplate.AndroidPushNotificationTemplateProperty(adm))

    override fun apns(apns: IResolvable) {
      cdkBuilder.apns(apns.let(IResolvable::unwrap))
    }

    override fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty) {
      cdkBuilder.apns(apns.let(CfnPushTemplate.APNSPushNotificationTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140fe6aaa3b7fcedb1514f88b9eed4f44f6e4ce11f306c55a26909382e8253e8")
    override
        fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = apns(CfnPushTemplate.APNSPushNotificationTemplateProperty(apns))

    override fun baidu(baidu: IResolvable) {
      cdkBuilder.baidu(baidu.let(IResolvable::unwrap))
    }

    override fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.baidu(baidu.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7891851045ad24b6beddf38bca495a87e2e09fa66092605aa695058504c584ad")
    override
        fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = baidu(CfnPushTemplate.AndroidPushNotificationTemplateProperty(baidu))

    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    override fun defaultValue(defaultValue: IResolvable) {
      cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
    }

    override
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty) {
      cdkBuilder.defaultValue(defaultValue.let(CfnPushTemplate.DefaultPushNotificationTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b17775c310d8a9a49630ab206f326aa7edb82f87db0145dceda18ac73b81fa")
    override
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = defaultValue(CfnPushTemplate.DefaultPushNotificationTemplateProperty(defaultValue))

    override fun gcm(gcm: IResolvable) {
      cdkBuilder.gcm(gcm.let(IResolvable::unwrap))
    }

    override fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.gcm(gcm.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9f8a4b02a981bf8d3f22c523e365181ff7a689420b198807a43963e762bcecb")
    override
        fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = gcm(CfnPushTemplate.AndroidPushNotificationTemplateProperty(gcm))

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps,
  ) : CdkObject(cdkObject), CfnPushTemplateProps {
    override fun adm(): Any? = unwrap(this).getAdm()

    override fun apns(): Any? = unwrap(this).getApns()

    override fun baidu(): Any? = unwrap(this).getBaidu()

    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    override fun gcm(): Any? = unwrap(this).getGcm()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPushTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps):
        CfnPushTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPushTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
  }
}
