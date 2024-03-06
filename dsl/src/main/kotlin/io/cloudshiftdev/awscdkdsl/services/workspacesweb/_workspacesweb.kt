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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings
import software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps
import software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider
import software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps
import software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings
import software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps
import software.amazon.awscdk.services.workspacesweb.CfnPortal
import software.amazon.awscdk.services.workspacesweb.CfnPortalProps
import software.amazon.awscdk.services.workspacesweb.CfnTrustStore
import software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings
import software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps
import software.constructs.Construct

public object workspacesweb {
    /**
     * This resource specifies browser settings that can be associated with a web portal.
     *
     * Once associated with a web portal, browser settings control how the browser will behave once
     * a user starts a streaming session for the web portal.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnBrowserSettings cfnBrowserSettings = CfnBrowserSettings.Builder.create(this,
     * "MyCfnBrowserSettings")
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .browserPolicy("browserPolicy")
     * .customerManagedKey("customerManagedKey")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html)
     */
    public inline fun cfnBrowserSettings(
        scope: Construct,
        id: String,
        block: CfnBrowserSettingsDsl.() -> Unit = {},
    ): CfnBrowserSettings {
        val builder = CfnBrowserSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBrowserSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnBrowserSettingsProps cfnBrowserSettingsProps = CfnBrowserSettingsProps.builder()
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .browserPolicy("browserPolicy")
     * .customerManagedKey("customerManagedKey")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html)
     */
    public inline fun cfnBrowserSettingsProps(
        block: CfnBrowserSettingsPropsDsl.() -> Unit = {}
    ): CfnBrowserSettingsProps {
        val builder = CfnBrowserSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies an identity provider that is then associated with a web portal.
     *
     * This resource is not required if your portal's `AuthenticationType` is IAM Identity Center.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnIdentityProvider cfnIdentityProvider = CfnIdentityProvider.Builder.create(this,
     * "MyCfnIdentityProvider")
     * .identityProviderDetails(Map.of(
     * "identityProviderDetailsKey", "identityProviderDetails"))
     * .identityProviderName("identityProviderName")
     * .identityProviderType("identityProviderType")
     * // the properties below are optional
     * .portalArn("portalArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html)
     */
    public inline fun cfnIdentityProvider(
        scope: Construct,
        id: String,
        block: CfnIdentityProviderDsl.() -> Unit = {},
    ): CfnIdentityProvider {
        val builder = CfnIdentityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentityProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnIdentityProviderProps cfnIdentityProviderProps = CfnIdentityProviderProps.builder()
     * .identityProviderDetails(Map.of(
     * "identityProviderDetailsKey", "identityProviderDetails"))
     * .identityProviderName("identityProviderName")
     * .identityProviderType("identityProviderType")
     * // the properties below are optional
     * .portalArn("portalArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html)
     */
    public inline fun cfnIdentityProviderProps(
        block: CfnIdentityProviderPropsDsl.() -> Unit = {}
    ): CfnIdentityProviderProps {
        val builder = CfnIdentityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies IP access settings that can be associated with a web portal.
     *
     * For more information, see
     * [Set up IP access controls (optional)](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/ip-access-controls.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnIpAccessSettings cfnIpAccessSettings = CfnIpAccessSettings.Builder.create(this,
     * "MyCfnIpAccessSettings")
     * .ipRules(List.of(IpRuleProperty.builder()
     * .ipRange("ipRange")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .customerManagedKey("customerManagedKey")
     * .description("description")
     * .displayName("displayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html)
     */
    public inline fun cfnIpAccessSettings(
        scope: Construct,
        id: String,
        block: CfnIpAccessSettingsDsl.() -> Unit = {},
    ): CfnIpAccessSettings {
        val builder = CfnIpAccessSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The IP rules of the IP access settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * IpRuleProperty ipRuleProperty = IpRuleProperty.builder()
     * .ipRange("ipRange")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html)
     */
    public inline fun cfnIpAccessSettingsIpRuleProperty(
        block: CfnIpAccessSettingsIpRulePropertyDsl.() -> Unit = {}
    ): CfnIpAccessSettings.IpRuleProperty {
        val builder = CfnIpAccessSettingsIpRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIpAccessSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnIpAccessSettingsProps cfnIpAccessSettingsProps = CfnIpAccessSettingsProps.builder()
     * .ipRules(List.of(IpRuleProperty.builder()
     * .ipRange("ipRange")
     * // the properties below are optional
     * .description("description")
     * .build()))
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .customerManagedKey("customerManagedKey")
     * .description("description")
     * .displayName("displayName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-ipaccesssettings.html)
     */
    public inline fun cfnIpAccessSettingsProps(
        block: CfnIpAccessSettingsPropsDsl.() -> Unit = {}
    ): CfnIpAccessSettingsProps {
        val builder = CfnIpAccessSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies network settings that can be associated with a web portal.
     *
     * Once associated with a web portal, network settings define how streaming instances will
     * connect with your specified VPC.
     *
     * The VPC must have default tenancy. VPCs with dedicated tenancy are not supported.
     *
     * For availability consideration, you must have at least two subnets created in two different
     * Availability Zones. WorkSpaces Web is available in a subset of the Availability Zones for
     * each supported Region. For more information, see
     * [Supported Availability Zones](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/availability-zones.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnNetworkSettings cfnNetworkSettings = CfnNetworkSettings.Builder.create(this,
     * "MyCfnNetworkSettings")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html)
     */
    public inline fun cfnNetworkSettings(
        scope: Construct,
        id: String,
        block: CfnNetworkSettingsDsl.() -> Unit = {},
    ): CfnNetworkSettings {
        val builder = CfnNetworkSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNetworkSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnNetworkSettingsProps cfnNetworkSettingsProps = CfnNetworkSettingsProps.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-networksettings.html)
     */
    public inline fun cfnNetworkSettingsProps(
        block: CfnNetworkSettingsPropsDsl.() -> Unit = {}
    ): CfnNetworkSettingsProps {
        val builder = CfnNetworkSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies a web portal, which users use to start browsing sessions.
     *
     * A `Standard` web portal can't start browsing sessions unless you have at defined and
     * associated an `IdentityProvider` and `NetworkSettings` resource. An `IAM Identity Center` web
     * portal does not require an `IdentityProvider` resource.
     *
     * For more information about web portals, see
     * [What is Amazon WorkSpaces Web?](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/what-is-workspaces-web.html.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnPortal cfnPortal = CfnPortal.Builder.create(this, "MyCfnPortal")
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .authenticationType("authenticationType")
     * .browserSettingsArn("browserSettingsArn")
     * .customerManagedKey("customerManagedKey")
     * .displayName("displayName")
     * .ipAccessSettingsArn("ipAccessSettingsArn")
     * .networkSettingsArn("networkSettingsArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trustStoreArn("trustStoreArn")
     * .userAccessLoggingSettingsArn("userAccessLoggingSettingsArn")
     * .userSettingsArn("userSettingsArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html)
     */
    public inline fun cfnPortal(
        scope: Construct,
        id: String,
        block: CfnPortalDsl.() -> Unit = {},
    ): CfnPortal {
        val builder = CfnPortalDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortal`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnPortalProps cfnPortalProps = CfnPortalProps.builder()
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .authenticationType("authenticationType")
     * .browserSettingsArn("browserSettingsArn")
     * .customerManagedKey("customerManagedKey")
     * .displayName("displayName")
     * .ipAccessSettingsArn("ipAccessSettingsArn")
     * .networkSettingsArn("networkSettingsArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trustStoreArn("trustStoreArn")
     * .userAccessLoggingSettingsArn("userAccessLoggingSettingsArn")
     * .userSettingsArn("userSettingsArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-portal.html)
     */
    public inline fun cfnPortalProps(block: CfnPortalPropsDsl.() -> Unit = {}): CfnPortalProps {
        val builder = CfnPortalPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies a trust store that can be associated with a web portal.
     *
     * A trust store contains certificate authority (CA) certificates. Once associated with a web
     * portal, the browser in a streaming session will recognize certificates that have been issued
     * using any of the CAs in the trust store. If your organization has internal websites that use
     * certificates issued by private CAs, you should add the private CA certificate to the trust
     * store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnTrustStore cfnTrustStore = CfnTrustStore.Builder.create(this, "MyCfnTrustStore")
     * .certificateList(List.of("certificateList"))
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html)
     */
    public inline fun cfnTrustStore(
        scope: Construct,
        id: String,
        block: CfnTrustStoreDsl.() -> Unit = {},
    ): CfnTrustStore {
        val builder = CfnTrustStoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTrustStore`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnTrustStoreProps cfnTrustStoreProps = CfnTrustStoreProps.builder()
     * .certificateList(List.of("certificateList"))
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html)
     */
    public inline fun cfnTrustStoreProps(
        block: CfnTrustStorePropsDsl.() -> Unit = {}
    ): CfnTrustStoreProps {
        val builder = CfnTrustStorePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies user access logging settings that can be associated with a web
     * portal.
     *
     * In order to receive logs from WorkSpaces Web, you must have an Amazon Kinesis Data Stream
     * that starts with "amazon-workspaces-web-*". Your Amazon Kinesis data stream must either have
     * server-side encryption turned off, or must use AWS managed keys for server-side encryption.
     *
     * For more information about setting server-side encryption in Amazon Kinesis , see
     * [How Do I Get Started with Server-Side Encryption?](https://docs.aws.amazon.com/streams/latest/dev/getting-started-with-sse.html)
     * .
     *
     * For more information about setting up user access logging, see
     * [Set up user access logging](https://docs.aws.amazon.com/workspaces-web/latest/adminguide/user-logging.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnUserAccessLoggingSettings cfnUserAccessLoggingSettings =
     * CfnUserAccessLoggingSettings.Builder.create(this, "MyCfnUserAccessLoggingSettings")
     * .kinesisStreamArn("kinesisStreamArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html)
     */
    public inline fun cfnUserAccessLoggingSettings(
        scope: Construct,
        id: String,
        block: CfnUserAccessLoggingSettingsDsl.() -> Unit = {},
    ): CfnUserAccessLoggingSettings {
        val builder = CfnUserAccessLoggingSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserAccessLoggingSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnUserAccessLoggingSettingsProps cfnUserAccessLoggingSettingsProps =
     * CfnUserAccessLoggingSettingsProps.builder()
     * .kinesisStreamArn("kinesisStreamArn")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-useraccessloggingsettings.html)
     */
    public inline fun cfnUserAccessLoggingSettingsProps(
        block: CfnUserAccessLoggingSettingsPropsDsl.() -> Unit = {}
    ): CfnUserAccessLoggingSettingsProps {
        val builder = CfnUserAccessLoggingSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource specifies user settings that can be associated with a web portal.
     *
     * Once associated with a web portal, user settings control how users can transfer data between
     * a streaming session and the their local devices.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnUserSettings cfnUserSettings = CfnUserSettings.Builder.create(this, "MyCfnUserSettings")
     * .copyAllowed("copyAllowed")
     * .downloadAllowed("downloadAllowed")
     * .pasteAllowed("pasteAllowed")
     * .printAllowed("printAllowed")
     * .uploadAllowed("uploadAllowed")
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty.builder()
     * .allowlist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * // the properties below are optional
     * .blocklist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * .build())
     * .customerManagedKey("customerManagedKey")
     * .disconnectTimeoutInMinutes(123)
     * .idleDisconnectTimeoutInMinutes(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html)
     */
    public inline fun cfnUserSettings(
        scope: Construct,
        id: String,
        block: CfnUserSettingsDsl.() -> Unit = {},
    ): CfnUserSettings {
        val builder = CfnUserSettingsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a single cookie or set of cookies in an end user's browser.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CookieSpecificationProperty cookieSpecificationProperty = CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html)
     */
    public inline fun cfnUserSettingsCookieSpecificationProperty(
        block: CfnUserSettingsCookieSpecificationPropertyDsl.() -> Unit = {}
    ): CfnUserSettings.CookieSpecificationProperty {
        val builder = CfnUserSettingsCookieSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CookieSynchronizationConfigurationProperty cookieSynchronizationConfigurationProperty =
     * CookieSynchronizationConfigurationProperty.builder()
     * .allowlist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * // the properties below are optional
     * .blocklist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html)
     */
    public inline fun cfnUserSettingsCookieSynchronizationConfigurationProperty(
        block: CfnUserSettingsCookieSynchronizationConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserSettings.CookieSynchronizationConfigurationProperty {
        val builder = CfnUserSettingsCookieSynchronizationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserSettings`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesweb.*;
     * CfnUserSettingsProps cfnUserSettingsProps = CfnUserSettingsProps.builder()
     * .copyAllowed("copyAllowed")
     * .downloadAllowed("downloadAllowed")
     * .pasteAllowed("pasteAllowed")
     * .printAllowed("printAllowed")
     * .uploadAllowed("uploadAllowed")
     * // the properties below are optional
     * .additionalEncryptionContext(Map.of(
     * "additionalEncryptionContextKey", "additionalEncryptionContext"))
     * .cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty.builder()
     * .allowlist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * // the properties below are optional
     * .blocklist(List.of(CookieSpecificationProperty.builder()
     * .domain("domain")
     * // the properties below are optional
     * .name("name")
     * .path("path")
     * .build()))
     * .build())
     * .customerManagedKey("customerManagedKey")
     * .disconnectTimeoutInMinutes(123)
     * .idleDisconnectTimeoutInMinutes(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html)
     */
    public inline fun cfnUserSettingsProps(
        block: CfnUserSettingsPropsDsl.() -> Unit = {}
    ): CfnUserSettingsProps {
        val builder = CfnUserSettingsPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
