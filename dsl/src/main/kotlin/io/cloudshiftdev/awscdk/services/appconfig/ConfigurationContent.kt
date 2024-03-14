package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String

public abstract class ConfigurationContent internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent,
) {
  public open fun content(): String = unwrap(this).getContent()

  public open fun contentType(): String = unwrap(this).getContentType()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent,
  ) : ConfigurationContent(cdkObject)

  public companion object {
    public open fun fromFile(inputPath: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromFile(inputPath).let(ConfigurationContent::wrap)

    public open fun fromFile(inputPath: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromFile(inputPath,
        contentType).let(ConfigurationContent::wrap)

    public open fun fromInline(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInline(content).let(ConfigurationContent::wrap)

    public open fun fromInline(content: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInline(content,
        contentType).let(ConfigurationContent::wrap)

    public open fun fromInlineJson(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineJson(content).let(ConfigurationContent::wrap)

    public open fun fromInlineJson(content: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineJson(content,
        contentType).let(ConfigurationContent::wrap)

    public open fun fromInlineText(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineText(content).let(ConfigurationContent::wrap)

    public open fun fromInlineYaml(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineYaml(content).let(ConfigurationContent::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent):
        ConfigurationContent = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationContent):
        software.amazon.awscdk.services.appconfig.ConfigurationContent = (wrapped as
        Wrapper).cdkObject
  }
}
