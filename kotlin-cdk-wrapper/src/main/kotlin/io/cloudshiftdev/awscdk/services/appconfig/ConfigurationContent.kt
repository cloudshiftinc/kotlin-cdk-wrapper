@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class ConfigurationContent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent,
) : CdkObject(cdkObject) {
  public open fun content(): String = unwrap(this).getContent()

  public open fun contentType(): String = unwrap(this).getContentType()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent,
  ) : ConfigurationContent(cdkObject)

  public companion object {
    public fun fromFile(inputPath: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromFile(inputPath).let(ConfigurationContent::wrap)

    public fun fromFile(inputPath: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromFile(inputPath,
        contentType).let(ConfigurationContent::wrap)

    public fun fromInline(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInline(content).let(ConfigurationContent::wrap)

    public fun fromInline(content: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInline(content,
        contentType).let(ConfigurationContent::wrap)

    public fun fromInlineJson(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineJson(content).let(ConfigurationContent::wrap)

    public fun fromInlineJson(content: String, contentType: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineJson(content,
        contentType).let(ConfigurationContent::wrap)

    public fun fromInlineText(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineText(content).let(ConfigurationContent::wrap)

    public fun fromInlineYaml(content: String): ConfigurationContent =
        software.amazon.awscdk.services.appconfig.ConfigurationContent.fromInlineYaml(content).let(ConfigurationContent::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ConfigurationContent):
        ConfigurationContent = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationContent):
        software.amazon.awscdk.services.appconfig.ConfigurationContent = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ConfigurationContent
  }
}
