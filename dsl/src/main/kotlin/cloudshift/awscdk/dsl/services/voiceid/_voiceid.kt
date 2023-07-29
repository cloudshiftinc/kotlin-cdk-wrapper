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

package cloudshift.awscdk.dsl.services.voiceid

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain
import software.amazon.awscdk.services.voiceid.CfnDomainProps
import software.constructs.Construct

public object voiceid {
    /**
     * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers,
     * fraudsters, customer audio, and voiceprints.
     *
     * Every domain is created with a default watchlist that fraudsters can be a part of.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.voiceid.*;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .name("name")
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.voiceid.*;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .name("name")
     * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration containing information about the customer managed key used for encrypting
     * customer data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.voiceid.*;
     * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
     * ServerSideEncryptionConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-voiceid-domain-serversideencryptionconfiguration.html)
     */
    public inline fun cfnDomainServerSideEncryptionConfigurationProperty(
        block: CfnDomainServerSideEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDomain.ServerSideEncryptionConfigurationProperty {
        val builder = CfnDomainServerSideEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
