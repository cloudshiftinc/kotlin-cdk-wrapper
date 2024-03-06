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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.b2bi.CfnCapability
import software.amazon.awscdk.services.b2bi.CfnCapabilityProps
import software.amazon.awscdk.services.b2bi.CfnPartnership
import software.amazon.awscdk.services.b2bi.CfnPartnershipProps
import software.amazon.awscdk.services.b2bi.CfnProfile
import software.amazon.awscdk.services.b2bi.CfnProfileProps
import software.amazon.awscdk.services.b2bi.CfnTransformer
import software.amazon.awscdk.services.b2bi.CfnTransformerProps
import software.constructs.Construct

public object b2bi {
    /**
     * Instantiates a capability based on the specified parameters.
     *
     * A trading capability contains the information required to transform incoming EDI documents
     * into JSON or XML outputs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnCapability cfnCapability = CfnCapability.Builder.create(this, "MyCfnCapability")
     * .configuration(CapabilityConfigurationProperty.builder()
     * .edi(EdiConfigurationProperty.builder()
     * .inputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .outputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .transformerId("transformerId")
     * .type(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .build())
     * .build())
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .instructionsDocuments(List.of(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html)
     */
    public inline fun cfnCapability(
        scope: Construct,
        id: String,
        block: CfnCapabilityDsl.() -> Unit = {},
    ): CfnCapability {
        val builder = CfnCapabilityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A capability object.
     *
     * Currently, only EDI (electronic data interchange) capabilities are supported. A trading
     * capability contains the information required to transform incoming EDI documents into JSON or
     * XML outputs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CapabilityConfigurationProperty capabilityConfigurationProperty =
     * CapabilityConfigurationProperty.builder()
     * .edi(EdiConfigurationProperty.builder()
     * .inputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .outputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .transformerId("transformerId")
     * .type(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-capabilityconfiguration.html)
     */
    public inline fun cfnCapabilityCapabilityConfigurationProperty(
        block: CfnCapabilityCapabilityConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCapability.CapabilityConfigurationProperty {
        val builder = CfnCapabilityCapabilityConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details for the EDI (electronic data interchange) transformation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * EdiConfigurationProperty ediConfigurationProperty = EdiConfigurationProperty.builder()
     * .inputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .outputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .transformerId("transformerId")
     * .type(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-ediconfiguration.html)
     */
    public inline fun cfnCapabilityEdiConfigurationProperty(
        block: CfnCapabilityEdiConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCapability.EdiConfigurationProperty {
        val builder = CfnCapabilityEdiConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * EdiTypeProperty ediTypeProperty = EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-editype.html)
     */
    public inline fun cfnCapabilityEdiTypeProperty(
        block: CfnCapabilityEdiTypePropertyDsl.() -> Unit = {}
    ): CfnCapability.EdiTypeProperty {
        val builder = CfnCapabilityEdiTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCapability`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnCapabilityProps cfnCapabilityProps = CfnCapabilityProps.builder()
     * .configuration(CapabilityConfigurationProperty.builder()
     * .edi(EdiConfigurationProperty.builder()
     * .inputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .outputLocation(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build())
     * .transformerId("transformerId")
     * .type(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .build())
     * .build())
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .instructionsDocuments(List.of(S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html)
     */
    public inline fun cfnCapabilityProps(
        block: CfnCapabilityPropsDsl.() -> Unit = {}
    ): CfnCapabilityProps {
        val builder = CfnCapabilityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details for the Amazon S3 file location that is being used with AWS B2BI Data
     * Interchange.
     *
     * File locations in Amazon S3 are identified using a combination of the bucket and key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
     * .bucketName("bucketName")
     * .key("key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-s3location.html)
     */
    public inline fun cfnCapabilityS3LocationProperty(
        block: CfnCapabilityS3LocationPropertyDsl.() -> Unit = {}
    ): CfnCapability.S3LocationProperty {
        val builder = CfnCapabilityS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * X12DetailsProperty x12DetailsProperty = X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-capability-x12details.html)
     */
    public inline fun cfnCapabilityX12DetailsProperty(
        block: CfnCapabilityX12DetailsPropertyDsl.() -> Unit = {}
    ): CfnCapability.X12DetailsProperty {
        val builder = CfnCapabilityX12DetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a partnership between a customer and a trading partner, based on the supplied
     * parameters.
     *
     * A partnership represents the connection between you and your trading partner. It ties
     * together a profile and one or more trading capabilities.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnPartnership cfnPartnership = CfnPartnership.Builder.create(this, "MyCfnPartnership")
     * .email("email")
     * .name("name")
     * .profileId("profileId")
     * // the properties below are optional
     * .capabilities(List.of("capabilities"))
     * .phone("phone")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html)
     */
    public inline fun cfnPartnership(
        scope: Construct,
        id: String,
        block: CfnPartnershipDsl.() -> Unit = {},
    ): CfnPartnership {
        val builder = CfnPartnershipDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPartnership`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnPartnershipProps cfnPartnershipProps = CfnPartnershipProps.builder()
     * .email("email")
     * .name("name")
     * .profileId("profileId")
     * // the properties below are optional
     * .capabilities(List.of("capabilities"))
     * .phone("phone")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html)
     */
    public inline fun cfnPartnershipProps(
        block: CfnPartnershipPropsDsl.() -> Unit = {}
    ): CfnPartnershipProps {
        val builder = CfnPartnershipPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a customer profile.
     *
     * You can have up to five customer profiles, each representing a distinct private network. A
     * profile is the mechanism used to create the concept of a private network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnProfile cfnProfile = CfnProfile.Builder.create(this, "MyCfnProfile")
     * .businessName("businessName")
     * .logging("logging")
     * .name("name")
     * .phone("phone")
     * // the properties below are optional
     * .email("email")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html)
     */
    public inline fun cfnProfile(
        scope: Construct,
        id: String,
        block: CfnProfileDsl.() -> Unit = {},
    ): CfnProfile {
        val builder = CfnProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
     * .businessName("businessName")
     * .logging("logging")
     * .name("name")
     * .phone("phone")
     * // the properties below are optional
     * .email("email")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html)
     */
    public inline fun cfnProfileProps(block: CfnProfilePropsDsl.() -> Unit = {}): CfnProfileProps {
        val builder = CfnProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a transformer.
     *
     * A transformer describes how to process the incoming EDI documents and extract the necessary
     * information to the output file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnTransformer cfnTransformer = CfnTransformer.Builder.create(this, "MyCfnTransformer")
     * .ediType(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .fileFormat("fileFormat")
     * .mappingTemplate("mappingTemplate")
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .modifiedAt("modifiedAt")
     * .sampleDocument("sampleDocument")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html)
     */
    public inline fun cfnTransformer(
        scope: Construct,
        id: String,
        block: CfnTransformerDsl.() -> Unit = {},
    ): CfnTransformer {
        val builder = CfnTransformerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * EdiTypeProperty ediTypeProperty = EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-editype.html)
     */
    public inline fun cfnTransformerEdiTypeProperty(
        block: CfnTransformerEdiTypePropertyDsl.() -> Unit = {}
    ): CfnTransformer.EdiTypeProperty {
        val builder = CfnTransformerEdiTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTransformer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * CfnTransformerProps cfnTransformerProps = CfnTransformerProps.builder()
     * .ediType(EdiTypeProperty.builder()
     * .x12Details(X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build())
     * .build())
     * .fileFormat("fileFormat")
     * .mappingTemplate("mappingTemplate")
     * .name("name")
     * .status("status")
     * // the properties below are optional
     * .modifiedAt("modifiedAt")
     * .sampleDocument("sampleDocument")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html)
     */
    public inline fun cfnTransformerProps(
        block: CfnTransformerPropsDsl.() -> Unit = {}
    ): CfnTransformerProps {
        val builder = CfnTransformerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains the X12 transaction set and version.
     *
     * The X12 structure is used when the system transforms an EDI (electronic data interchange)
     * file.
     *
     * If an EDI input file contains more than one transaction, each transaction must have the same
     * transaction set and version, for example 214/4010. If not, the transformer cannot parse the
     * file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.b2bi.*;
     * X12DetailsProperty x12DetailsProperty = X12DetailsProperty.builder()
     * .transactionSet("transactionSet")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-transformer-x12details.html)
     */
    public inline fun cfnTransformerX12DetailsProperty(
        block: CfnTransformerX12DetailsPropertyDsl.() -> Unit = {}
    ): CfnTransformer.X12DetailsProperty {
        val builder = CfnTransformerX12DetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
