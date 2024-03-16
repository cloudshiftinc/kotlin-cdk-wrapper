@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
 * .providerName("MyJenkinsProvider")
 * .serverUrl("http://my-jenkins.com:8080")
 * .version("2")
 * .build();
 * ```
 */
public interface JenkinsProviderProps {
  /**
   * Whether to immediately register a Jenkins Provider for the build category.
   *
   * The Provider will always be registered if you create a `JenkinsAction`.
   *
   * Default: false
   */
  public fun forBuild(): Boolean? = unwrap(this).getForBuild()

  /**
   * Whether to immediately register a Jenkins Provider for the test category.
   *
   * The Provider will always be registered if you create a `JenkinsTestAction`.
   *
   * Default: false
   */
  public fun forTest(): Boolean? = unwrap(this).getForTest()

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
   * A builder for [JenkinsProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param forBuild Whether to immediately register a Jenkins Provider for the build category.
     * The Provider will always be registered if you create a `JenkinsAction`.
     */
    public fun forBuild(forBuild: Boolean)

    /**
     * @param forTest Whether to immediately register a Jenkins Provider for the test category.
     * The Provider will always be registered if you create a `JenkinsTestAction`.
     */
    public fun forTest(forTest: Boolean)

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
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.builder()

    /**
     * @param forBuild Whether to immediately register a Jenkins Provider for the build category.
     * The Provider will always be registered if you create a `JenkinsAction`.
     */
    override fun forBuild(forBuild: Boolean) {
      cdkBuilder.forBuild(forBuild)
    }

    /**
     * @param forTest Whether to immediately register a Jenkins Provider for the test category.
     * The Provider will always be registered if you create a `JenkinsTestAction`.
     */
    override fun forTest(forTest: Boolean) {
      cdkBuilder.forTest(forTest)
    }

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps,
  ) : CdkObject(cdkObject), JenkinsProviderProps {
    /**
     * Whether to immediately register a Jenkins Provider for the build category.
     *
     * The Provider will always be registered if you create a `JenkinsAction`.
     *
     * Default: false
     */
    override fun forBuild(): Boolean? = unwrap(this).getForBuild()

    /**
     * Whether to immediately register a Jenkins Provider for the test category.
     *
     * The Provider will always be registered if you create a `JenkinsTestAction`.
     *
     * Default: false
     */
    override fun forTest(): Boolean? = unwrap(this).getForTest()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps):
        JenkinsProviderProps = CdkObjectWrappers.wrap(cdkObject) as JenkinsProviderProps

    internal fun unwrap(wrapped: JenkinsProviderProps):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
  }
}
