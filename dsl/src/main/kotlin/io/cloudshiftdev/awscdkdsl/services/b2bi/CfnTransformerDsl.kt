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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.b2bi.CfnTransformer
import software.constructs.Construct

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
@CdkDslMarker
public class CfnTransformerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransformer.Builder = CfnTransformer.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     *
     * @param ediType Returns the details for the EDI standard that is being used for the
     *   transformer.
     */
    public fun ediType(ediType: IResolvable) {
        cdkBuilder.ediType(ediType)
    }

    /**
     * Returns the details for the EDI standard that is being used for the transformer.
     *
     * Currently, only X12 is supported. X12 is a set of standards and corresponding messages that
     * define specific business documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-editype)
     *
     * @param ediType Returns the details for the EDI standard that is being used for the
     *   transformer.
     */
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty) {
        cdkBuilder.ediType(ediType)
    }

    /**
     * Returns that the currently supported file formats for EDI transformations are `JSON` and
     * `XML` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-fileformat)
     *
     * @param fileFormat Returns that the currently supported file formats for EDI transformations
     *   are `JSON` and `XML` .
     */
    public fun fileFormat(fileFormat: String) {
        cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-mappingtemplate)
     *
     * @param mappingTemplate Returns a sample EDI document that is used by a transformer as a guide
     *   for processing the EDI data.
     */
    public fun mappingTemplate(mappingTemplate: String) {
        cdkBuilder.mappingTemplate(mappingTemplate)
    }

    /**
     * Returns a timestamp representing the date and time for the most recent change for the
     * transformer object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-modifiedat)
     *
     * @param modifiedAt Returns a timestamp representing the date and time for the most recent
     *   change for the transformer object.
     */
    public fun modifiedAt(modifiedAt: String) {
        cdkBuilder.modifiedAt(modifiedAt)
    }

    /**
     * Returns the descriptive name for the transformer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-name)
     *
     * @param name Returns the descriptive name for the transformer.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Returns a sample EDI document that is used by a transformer as a guide for processing the EDI
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-sampledocument)
     *
     * @param sampleDocument Returns a sample EDI document that is used by a transformer as a guide
     *   for processing the EDI data.
     */
    public fun sampleDocument(sampleDocument: String) {
        cdkBuilder.sampleDocument(sampleDocument)
    }

    /**
     * Returns the state of the newly created transformer.
     *
     * The transformer can be either `active` or `inactive` . For the transformer to be used in a
     * capability, its status must `active` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-status)
     *
     * @param status Returns the state of the newly created transformer.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     *
     * @param tags A key-value pair for a specific transformer.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A key-value pair for a specific transformer.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-transformer.html#cfn-b2bi-transformer-tags)
     *
     * @param tags A key-value pair for a specific transformer.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTransformer {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
