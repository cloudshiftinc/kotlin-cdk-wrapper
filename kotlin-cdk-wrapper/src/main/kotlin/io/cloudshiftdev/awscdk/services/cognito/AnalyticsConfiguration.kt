@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.pinpoint.CfnApp
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The settings for Amazon Pinpoint analytics configuration.
 *
 * With an analytics configuration, your application can collect user-activity metrics for user
 * notifications with an Amazon Pinpoint campaign.
 * Amazon Pinpoint isn't available in all AWS Regions.
 * For a list of available Regions, see Amazon Cognito and Amazon Pinpoint Region availability:
 * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-pinpoint-integration.html#cognito-user-pools-find-region-mappings.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * UserPool userPool;
 * CfnApp pinpointApp;
 * Role pinpointRole;
 * UserPoolClient.Builder.create(this, "Client")
 * .userPool(userPool)
 * .analytics(AnalyticsConfiguration.builder()
 * // Your Pinpoint project
 * .application(pinpointApp)
 * // Whether to include user data in analytics events
 * .shareUserData(true)
 * .build())
 * .build();
 * ```
 */
public interface AnalyticsConfiguration {
  /**
   * The Amazon Pinpoint project that you want to connect to your user pool app client.
   *
   * Amazon Cognito publishes events to the Amazon Pinpoint project.
   * You can also configure your application to pass an endpoint ID in the `AnalyticsMetadata`
   * parameter of sign-in operations.
   * The endpoint ID is information about the destination for push notifications.
   *
   * Default: - no configuration, you need to specify either `application` or all of
   * `applicationId`, `externalId`, and `role`.
   */
  public fun application(): CfnApp? = unwrap(this).getApplication()?.let(CfnApp::wrap)

  /**
   * Your Amazon Pinpoint project ID.
   *
   * Default: - no configuration, you need to specify either this property along with `externalId`
   * and `role` or `application`.
   */
  public fun applicationId(): String? = unwrap(this).getApplicationId()

  /**
   * The external ID of the role that Amazon Cognito assumes to send analytics data to Amazon
   * Pinpoint.
   *
   * More info here:
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
   *
   * Default: - no configuration, you need to specify either this property along with
   * `applicationId` and `role` or `application`.
   */
  public fun externalId(): String? = unwrap(this).getExternalId()

  /**
   * The IAM role that has the permissions required for Amazon Cognito to publish events to Amazon
   * Pinpoint analytics.
   *
   * Default: - no configuration, you need to specify either this property along with
   * `applicationId` and `externalId` or `application`.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * If `true`, Amazon Cognito includes user data in the events that it publishes to Amazon Pinpoint
   * analytics.
   *
   * Default: - false
   */
  public fun shareUserData(): Boolean? = unwrap(this).getShareUserData()

  /**
   * A builder for [AnalyticsConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The Amazon Pinpoint project that you want to connect to your user pool app
     * client.
     * Amazon Cognito publishes events to the Amazon Pinpoint project.
     * You can also configure your application to pass an endpoint ID in the `AnalyticsMetadata`
     * parameter of sign-in operations.
     * The endpoint ID is information about the destination for push notifications.
     */
    public fun application(application: CfnApp)

    /**
     * @param applicationId Your Amazon Pinpoint project ID.
     */
    public fun applicationId(applicationId: String)

    /**
     * @param externalId The external ID of the role that Amazon Cognito assumes to send analytics
     * data to Amazon Pinpoint.
     * More info here:
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     */
    public fun externalId(externalId: String)

    /**
     * @param role The IAM role that has the permissions required for Amazon Cognito to publish
     * events to Amazon Pinpoint analytics.
     */
    public fun role(role: IRole)

    /**
     * @param shareUserData If `true`, Amazon Cognito includes user data in the events that it
     * publishes to Amazon Pinpoint analytics.
     */
    public fun shareUserData(shareUserData: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AnalyticsConfiguration.Builder =
        software.amazon.awscdk.services.cognito.AnalyticsConfiguration.builder()

    /**
     * @param application The Amazon Pinpoint project that you want to connect to your user pool app
     * client.
     * Amazon Cognito publishes events to the Amazon Pinpoint project.
     * You can also configure your application to pass an endpoint ID in the `AnalyticsMetadata`
     * parameter of sign-in operations.
     * The endpoint ID is information about the destination for push notifications.
     */
    override fun application(application: CfnApp) {
      cdkBuilder.application(application.let(CfnApp.Companion::unwrap))
    }

    /**
     * @param applicationId Your Amazon Pinpoint project ID.
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param externalId The external ID of the role that Amazon Cognito assumes to send analytics
     * data to Amazon Pinpoint.
     * More info here:
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     */
    override fun externalId(externalId: String) {
      cdkBuilder.externalId(externalId)
    }

    /**
     * @param role The IAM role that has the permissions required for Amazon Cognito to publish
     * events to Amazon Pinpoint analytics.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param shareUserData If `true`, Amazon Cognito includes user data in the events that it
     * publishes to Amazon Pinpoint analytics.
     */
    override fun shareUserData(shareUserData: Boolean) {
      cdkBuilder.shareUserData(shareUserData)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AnalyticsConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.AnalyticsConfiguration,
  ) : CdkObject(cdkObject),
      AnalyticsConfiguration {
    /**
     * The Amazon Pinpoint project that you want to connect to your user pool app client.
     *
     * Amazon Cognito publishes events to the Amazon Pinpoint project.
     * You can also configure your application to pass an endpoint ID in the `AnalyticsMetadata`
     * parameter of sign-in operations.
     * The endpoint ID is information about the destination for push notifications.
     *
     * Default: - no configuration, you need to specify either `application` or all of
     * `applicationId`, `externalId`, and `role`.
     */
    override fun application(): CfnApp? = unwrap(this).getApplication()?.let(CfnApp::wrap)

    /**
     * Your Amazon Pinpoint project ID.
     *
     * Default: - no configuration, you need to specify either this property along with `externalId`
     * and `role` or `application`.
     */
    override fun applicationId(): String? = unwrap(this).getApplicationId()

    /**
     * The external ID of the role that Amazon Cognito assumes to send analytics data to Amazon
     * Pinpoint.
     *
     * More info here:
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
     *
     * Default: - no configuration, you need to specify either this property along with
     * `applicationId` and `role` or `application`.
     */
    override fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The IAM role that has the permissions required for Amazon Cognito to publish events to Amazon
     * Pinpoint analytics.
     *
     * Default: - no configuration, you need to specify either this property along with
     * `applicationId` and `externalId` or `application`.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * If `true`, Amazon Cognito includes user data in the events that it publishes to Amazon
     * Pinpoint analytics.
     *
     * Default: - false
     */
    override fun shareUserData(): Boolean? = unwrap(this).getShareUserData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AnalyticsConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AnalyticsConfiguration):
        AnalyticsConfiguration = CdkObjectWrappers.wrap(cdkObject) as? AnalyticsConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AnalyticsConfiguration):
        software.amazon.awscdk.services.cognito.AnalyticsConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.AnalyticsConfiguration
  }
}
