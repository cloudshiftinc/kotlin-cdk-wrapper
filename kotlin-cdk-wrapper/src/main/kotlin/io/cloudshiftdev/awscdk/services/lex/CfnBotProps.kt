@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBotProps {
  public fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

  public fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

  public fun botLocales(): Any? = unwrap(this).getBotLocales()

  public fun botTags(): Any? = unwrap(this).getBotTags()

  public fun dataPrivacy(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun idleSessionTtlInSeconds(): Number

  public fun name(): String

  public fun roleArn(): String

  public fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

  public fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()

  @CdkDslMarker
  public interface Builder {
    public fun autoBuildBotLocales(autoBuildBotLocales: Boolean)

    public fun autoBuildBotLocales(autoBuildBotLocales: IResolvable)

    public fun botFileS3Location(botFileS3Location: IResolvable)

    public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c23a3aca0464bbb24762140b4a4cea5220bb7e3ec304556d4be0132601c8b16")
    public fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty.Builder.() -> Unit)

    public fun botLocales(botLocales: IResolvable)

    public fun botLocales(botLocales: List<Any>)

    public fun botLocales(vararg botLocales: Any)

    public fun botTags(botTags: IResolvable)

    public fun botTags(botTags: List<Any>)

    public fun botTags(vararg botTags: Any)

    public fun dataPrivacy(dataPrivacy: Any)

    public fun description(description: String)

    public fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun testBotAliasSettings(testBotAliasSettings: IResolvable)

    public fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("280b2f11508ec906f28d882eb773178aedc59680df21e8d2929f6b3f8de65389")
    public
        fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty.Builder.() -> Unit)

    public fun testBotAliasTags(testBotAliasTags: IResolvable)

    public fun testBotAliasTags(testBotAliasTags: List<Any>)

    public fun testBotAliasTags(vararg testBotAliasTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotProps.builder()

    override fun autoBuildBotLocales(autoBuildBotLocales: Boolean) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales)
    }

    override fun autoBuildBotLocales(autoBuildBotLocales: IResolvable) {
      cdkBuilder.autoBuildBotLocales(autoBuildBotLocales.let(IResolvable::unwrap))
    }

    override fun botFileS3Location(botFileS3Location: IResolvable) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(IResolvable::unwrap))
    }

    override fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty) {
      cdkBuilder.botFileS3Location(botFileS3Location.let(CfnBot.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c23a3aca0464bbb24762140b4a4cea5220bb7e3ec304556d4be0132601c8b16")
    override fun botFileS3Location(botFileS3Location: CfnBot.S3LocationProperty.Builder.() -> Unit):
        Unit = botFileS3Location(CfnBot.S3LocationProperty(botFileS3Location))

    override fun botLocales(botLocales: IResolvable) {
      cdkBuilder.botLocales(botLocales.let(IResolvable::unwrap))
    }

    override fun botLocales(botLocales: List<Any>) {
      cdkBuilder.botLocales(botLocales)
    }

    override fun botLocales(vararg botLocales: Any): Unit = botLocales(botLocales.toList())

    override fun botTags(botTags: IResolvable) {
      cdkBuilder.botTags(botTags.let(IResolvable::unwrap))
    }

    override fun botTags(botTags: List<Any>) {
      cdkBuilder.botTags(botTags)
    }

    override fun botTags(vararg botTags: Any): Unit = botTags(botTags.toList())

    override fun dataPrivacy(dataPrivacy: Any) {
      cdkBuilder.dataPrivacy(dataPrivacy)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun idleSessionTtlInSeconds(idleSessionTtlInSeconds: Number) {
      cdkBuilder.idleSessionTtlInSeconds(idleSessionTtlInSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun testBotAliasSettings(testBotAliasSettings: IResolvable) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(IResolvable::unwrap))
    }

    override fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty) {
      cdkBuilder.testBotAliasSettings(testBotAliasSettings.let(CfnBot.TestBotAliasSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("280b2f11508ec906f28d882eb773178aedc59680df21e8d2929f6b3f8de65389")
    override
        fun testBotAliasSettings(testBotAliasSettings: CfnBot.TestBotAliasSettingsProperty.Builder.() -> Unit):
        Unit = testBotAliasSettings(CfnBot.TestBotAliasSettingsProperty(testBotAliasSettings))

    override fun testBotAliasTags(testBotAliasTags: IResolvable) {
      cdkBuilder.testBotAliasTags(testBotAliasTags.let(IResolvable::unwrap))
    }

    override fun testBotAliasTags(testBotAliasTags: List<Any>) {
      cdkBuilder.testBotAliasTags(testBotAliasTags)
    }

    override fun testBotAliasTags(vararg testBotAliasTags: Any): Unit =
        testBotAliasTags(testBotAliasTags.toList())

    public fun build(): software.amazon.awscdk.services.lex.CfnBotProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lex.CfnBotProps,
  ) : CdkObject(cdkObject), CfnBotProps {
    override fun autoBuildBotLocales(): Any? = unwrap(this).getAutoBuildBotLocales()

    override fun botFileS3Location(): Any? = unwrap(this).getBotFileS3Location()

    override fun botLocales(): Any? = unwrap(this).getBotLocales()

    override fun botTags(): Any? = unwrap(this).getBotTags()

    override fun dataPrivacy(): Any = unwrap(this).getDataPrivacy()

    override fun description(): String? = unwrap(this).getDescription()

    override fun idleSessionTtlInSeconds(): Number = unwrap(this).getIdleSessionTtlInSeconds()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun testBotAliasSettings(): Any? = unwrap(this).getTestBotAliasSettings()

    override fun testBotAliasTags(): Any? = unwrap(this).getTestBotAliasTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotProps): CfnBotProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotProps): software.amazon.awscdk.services.lex.CfnBotProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnBotProps
  }
}
