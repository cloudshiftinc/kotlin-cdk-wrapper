@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnHostedConfigurationVersionProps {
  public fun applicationId(): String

  public fun configurationProfileId(): String

  public fun content(): String

  public fun contentType(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun configurationProfileId(configurationProfileId: String)

    public fun content(content: String)

    public fun contentType(contentType: String)

    public fun description(description: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun configurationProfileId(configurationProfileId: String) {
      cdkBuilder.configurationProfileId(configurationProfileId)
    }

    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps,
  ) : CdkObject(cdkObject), CfnHostedConfigurationVersionProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

    override fun content(): String = unwrap(this).getContent()

    override fun contentType(): String = unwrap(this).getContentType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHostedConfigurationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps):
        CfnHostedConfigurationVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHostedConfigurationVersionProps):
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
  }
}
