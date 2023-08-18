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

package io.cloudshiftdev.awscdkdsl.services.finspace

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.finspace.CfnEnvironment
import software.amazon.awscdk.services.finspace.CfnEnvironmentProps
import software.constructs.Construct

public object finspace {
    /**
     * The `AWS::FinSpace::Environment` resource represents an Amazon FinSpace environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.finspace.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .name("name")
     * // the properties below are optional
     * .dataBundles(List.of("dataBundles"))
     * .description("description")
     * .federationMode("federationMode")
     * .federationParameters(FederationParametersProperty.builder()
     * .applicationCallBackUrl("applicationCallBackUrl")
     * .attributeMap(List.of(AttributeMapItemsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .federationProviderName("federationProviderName")
     * .federationUrn("federationUrn")
     * .samlMetadataDocument("samlMetadataDocument")
     * .samlMetadataUrl("samlMetadataUrl")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .superuserParameters(SuperuserParametersProperty.builder()
     * .emailAddress("emailAddress")
     * .firstName("firstName")
     * .lastName("lastName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.finspace.*;
     * AttributeMapItemsProperty attributeMapItemsProperty = AttributeMapItemsProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-attributemapitems.html)
     */
    public inline fun cfnEnvironmentAttributeMapItemsProperty(
        block: CfnEnvironmentAttributeMapItemsPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.AttributeMapItemsProperty {
        val builder = CfnEnvironmentAttributeMapItemsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.finspace.*;
     * FederationParametersProperty federationParametersProperty =
     * FederationParametersProperty.builder()
     * .applicationCallBackUrl("applicationCallBackUrl")
     * .attributeMap(List.of(AttributeMapItemsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .federationProviderName("federationProviderName")
     * .federationUrn("federationUrn")
     * .samlMetadataDocument("samlMetadataDocument")
     * .samlMetadataUrl("samlMetadataUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-federationparameters.html)
     */
    public inline fun cfnEnvironmentFederationParametersProperty(
        block: CfnEnvironmentFederationParametersPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.FederationParametersProperty {
        val builder = CfnEnvironmentFederationParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.finspace.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .name("name")
     * // the properties below are optional
     * .dataBundles(List.of("dataBundles"))
     * .description("description")
     * .federationMode("federationMode")
     * .federationParameters(FederationParametersProperty.builder()
     * .applicationCallBackUrl("applicationCallBackUrl")
     * .attributeMap(List.of(AttributeMapItemsProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .federationProviderName("federationProviderName")
     * .federationUrn("federationUrn")
     * .samlMetadataDocument("samlMetadataDocument")
     * .samlMetadataUrl("samlMetadataUrl")
     * .build())
     * .kmsKeyId("kmsKeyId")
     * .superuserParameters(SuperuserParametersProperty.builder()
     * .emailAddress("emailAddress")
     * .firstName("firstName")
     * .lastName("lastName")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information for the superuser.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.finspace.*;
     * SuperuserParametersProperty superuserParametersProperty = SuperuserParametersProperty.builder()
     * .emailAddress("emailAddress")
     * .firstName("firstName")
     * .lastName("lastName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-finspace-environment-superuserparameters.html)
     */
    public inline fun cfnEnvironmentSuperuserParametersProperty(
        block: CfnEnvironmentSuperuserParametersPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.SuperuserParametersProperty {
        val builder = CfnEnvironmentSuperuserParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
