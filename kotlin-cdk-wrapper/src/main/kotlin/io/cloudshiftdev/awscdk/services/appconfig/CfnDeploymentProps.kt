@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeploymentProps {
  public fun applicationId(): String

  public fun configurationProfileId(): String

  public fun configurationVersion(): String

  public fun deploymentStrategyId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentId(): String

  public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun configurationProfileId(configurationProfileId: String)

    public fun configurationVersion(configurationVersion: String)

    public fun deploymentStrategyId(deploymentStrategyId: String)

    public fun description(description: String)

    public fun environmentId(environmentId: String)

    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnDeploymentProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnDeploymentProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun configurationProfileId(configurationProfileId: String) {
      cdkBuilder.configurationProfileId(configurationProfileId)
    }

    override fun configurationVersion(configurationVersion: String) {
      cdkBuilder.configurationVersion(configurationVersion)
    }

    override fun deploymentStrategyId(deploymentStrategyId: String) {
      cdkBuilder.deploymentStrategyId(deploymentStrategyId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentProps,
  ) : CdkObject(cdkObject), CfnDeploymentProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

    override fun configurationVersion(): String = unwrap(this).getConfigurationVersion()

    override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentId(): String = unwrap(this).getEnvironmentId()

    override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentProps):
        CfnDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.appconfig.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnDeploymentProps
  }
}
