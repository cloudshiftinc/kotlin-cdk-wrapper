@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHostedConfigurationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrVersionNumber(): String = unwrap(this).getAttrVersionNumber()

  public open fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

  public open fun configurationProfileId(`value`: String) {
    unwrap(this).setConfigurationProfileId(`value`)
  }

  public open fun content(): String = unwrap(this).getContent()

  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  public open fun contentType(): String = unwrap(this).getContentType()

  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public open fun latestVersionNumber(`value`: Number) {
    unwrap(this).setLatestVersionNumber(`value`)
  }

  public open fun versionLabel(): String? = unwrap(this).getVersionLabel()

  public open fun versionLabel(`value`: String) {
    unwrap(this).setVersionLabel(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHostedConfigurationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHostedConfigurationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion):
        CfnHostedConfigurationVersion = CfnHostedConfigurationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHostedConfigurationVersion):
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion = wrapped.cdkObject
  }
}
