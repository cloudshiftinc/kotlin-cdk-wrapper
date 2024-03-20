@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A class representing Jenkins providers.
 *
 * Example:
 *
 * ```
 * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
 * .providerName("MyJenkinsProvider")
 * .serverUrl("http://my-jenkins.com:8080")
 * .version("2")
 * .build();
 * ```
 *
 * [Documentation]( #import)
 */
public open class JenkinsProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider,
) : BaseJenkinsProvider(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: JenkinsProviderProps,
  ) :
      this(software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(JenkinsProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: JenkinsProviderProps.Builder.() -> Unit,
  ) : this(scope, id, JenkinsProviderProps(props)
  )

  /**
   *
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   *
   */
  public override fun serverUrl(): String = unwrap(this).getServerUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.JenkinsProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to immediately register a Jenkins Provider for the build category.
     *
     * The Provider will always be registered if you create a `JenkinsAction`.
     *
     * Default: false
     *
     * @param forBuild Whether to immediately register a Jenkins Provider for the build category. 
     */
    public fun forBuild(forBuild: Boolean)

    /**
     * Whether to immediately register a Jenkins Provider for the test category.
     *
     * The Provider will always be registered if you create a `JenkinsTestAction`.
     *
     * Default: false
     *
     * @param forTest Whether to immediately register a Jenkins Provider for the test category. 
     */
    public fun forTest(forTest: Boolean)

    /**
     * The name of the Jenkins provider that you set in the AWS CodePipeline plugin configuration of
     * your Jenkins project.
     *
     * Example:
     *
     * ```
     * "MyJenkinsProvider";
     * ```
     *
     * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
     * plugin configuration of your Jenkins project. 
     */
    public fun providerName(providerName: String)

    /**
     * The base URL of your Jenkins server.
     *
     * Example:
     *
     * ```
     * "http://myjenkins.com:8080";
     * ```
     *
     * @param serverUrl The base URL of your Jenkins server. 
     */
    public fun serverUrl(serverUrl: String)

    /**
     * The version of your provider.
     *
     * Default: '1'
     *
     * @param version The version of your provider. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder.create(scope,
        id)

    /**
     * Whether to immediately register a Jenkins Provider for the build category.
     *
     * The Provider will always be registered if you create a `JenkinsAction`.
     *
     * Default: false
     *
     * @param forBuild Whether to immediately register a Jenkins Provider for the build category. 
     */
    override fun forBuild(forBuild: Boolean) {
      cdkBuilder.forBuild(forBuild)
    }

    /**
     * Whether to immediately register a Jenkins Provider for the test category.
     *
     * The Provider will always be registered if you create a `JenkinsTestAction`.
     *
     * Default: false
     *
     * @param forTest Whether to immediately register a Jenkins Provider for the test category. 
     */
    override fun forTest(forTest: Boolean) {
      cdkBuilder.forTest(forTest)
    }

    /**
     * The name of the Jenkins provider that you set in the AWS CodePipeline plugin configuration of
     * your Jenkins project.
     *
     * Example:
     *
     * ```
     * "MyJenkinsProvider";
     * ```
     *
     * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
     * plugin configuration of your Jenkins project. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * The base URL of your Jenkins server.
     *
     * Example:
     *
     * ```
     * "http://myjenkins.com:8080";
     * ```
     *
     * @param serverUrl The base URL of your Jenkins server. 
     */
    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    /**
     * The version of your provider.
     *
     * Default: '1'
     *
     * @param version The version of your provider. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromJenkinsProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: JenkinsProviderAttributes,
    ): IJenkinsProvider =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.fromJenkinsProviderAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(JenkinsProviderAttributes::unwrap)).let(IJenkinsProvider::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d90bec4732ec43072405e8717ccd4c0c26b54a0f0ed3221b659c8cb4a9e3db6")
    public fun fromJenkinsProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: JenkinsProviderAttributes.Builder.() -> Unit,
    ): IJenkinsProvider = fromJenkinsProviderAttributes(scope, id, JenkinsProviderAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): JenkinsProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return JenkinsProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider):
        JenkinsProvider = JenkinsProvider(cdkObject)

    internal fun unwrap(wrapped: JenkinsProvider):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider = wrapped.cdkObject
  }
}
