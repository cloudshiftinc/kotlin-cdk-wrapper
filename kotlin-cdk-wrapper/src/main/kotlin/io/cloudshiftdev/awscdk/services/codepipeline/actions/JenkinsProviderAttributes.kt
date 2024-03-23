@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for importing an existing Jenkins provider.
 *
 * Example:
 *
 * ```
 * IJenkinsProvider jenkinsProvider = JenkinsProvider.fromJenkinsProviderAttributes(this,
 * "JenkinsProvider", JenkinsProviderAttributes.builder()
 * .providerName("MyJenkinsProvider")
 * .serverUrl("http://my-jenkins.com:8080")
 * .version("2")
 * .build());
 * ```
 */
public interface JenkinsProviderAttributes {
  /**
   * The name of the Jenkins provider that you set in the AWS CodePipeline plugin configuration of
   * your Jenkins project.
   *
   * Example:
   *
   * ```
   * "MyJenkinsProvider";
   * ```
   */
  public fun providerName(): String

  /**
   * The base URL of your Jenkins server.
   *
   * Example:
   *
   * ```
   * "http://myjenkins.com:8080";
   * ```
   */
  public fun serverUrl(): String

  /**
   * The version of your provider.
   *
   * Default: '1'
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [JenkinsProviderAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
     * plugin configuration of your Jenkins project. 
     */
    public fun providerName(providerName: String)

    /**
     * @param serverUrl The base URL of your Jenkins server. 
     */
    public fun serverUrl(serverUrl: String)

    /**
     * @param version The version of your provider.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.builder()

    /**
     * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
     * plugin configuration of your Jenkins project. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * @param serverUrl The base URL of your Jenkins server. 
     */
    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    /**
     * @param version The version of your provider.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes,
  ) : CdkObject(cdkObject), JenkinsProviderAttributes {
    /**
     * The name of the Jenkins provider that you set in the AWS CodePipeline plugin configuration of
     * your Jenkins project.
     *
     * Example:
     *
     * ```
     * "MyJenkinsProvider";
     * ```
     */
    override fun providerName(): String = unwrap(this).getProviderName()

    /**
     * The base URL of your Jenkins server.
     *
     * Example:
     *
     * ```
     * "http://myjenkins.com:8080";
     * ```
     */
    override fun serverUrl(): String = unwrap(this).getServerUrl()

    /**
     * The version of your provider.
     *
     * Default: '1'
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsProviderAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes):
        JenkinsProviderAttributes = CdkObjectWrappers.wrap(cdkObject) as? JenkinsProviderAttributes
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: JenkinsProviderAttributes):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes
  }
}
