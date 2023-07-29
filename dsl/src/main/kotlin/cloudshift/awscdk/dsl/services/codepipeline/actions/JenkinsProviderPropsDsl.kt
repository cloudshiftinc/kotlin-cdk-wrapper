@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps

/**
 * Example:
 * ```
 * JenkinsProvider jenkinsProvider = JenkinsProvider.Builder.create(this, "JenkinsProvider")
 * .providerName("MyJenkinsProvider")
 * .serverUrl("http://my-jenkins.com:8080")
 * .version("2")
 * .build();
 * ```
 */
@CdkDslMarker
public class JenkinsProviderPropsDsl {
    private val cdkBuilder: JenkinsProviderProps.Builder = JenkinsProviderProps.builder()

    /**
     * @param forBuild Whether to immediately register a Jenkins Provider for the build category.
     *   The Provider will always be registered if you create a `JenkinsAction`.
     */
    public fun forBuild(forBuild: Boolean) {
        cdkBuilder.forBuild(forBuild)
    }

    /**
     * @param forTest Whether to immediately register a Jenkins Provider for the test category. The
     *   Provider will always be registered if you create a `JenkinsTestAction`.
     */
    public fun forTest(forTest: Boolean) {
        cdkBuilder.forTest(forTest)
    }

    /**
     * @param providerName The name of the Jenkins provider that you set in the AWS CodePipeline
     *   plugin configuration of your Jenkins project.
     */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /** @param serverUrl The base URL of your Jenkins server. */
    public fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
    }

    /** @param version The version of your provider. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): JenkinsProviderProps = cdkBuilder.build()
}
