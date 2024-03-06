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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The details of a metadata form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * FormInputProperty formInputProperty = FormInputProperty.builder()
 * .formName("formName")
 * // the properties below are optional
 * .content("content")
 * .typeIdentifier("typeIdentifier")
 * .typeRevision("typeRevision")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html)
 */
@CdkDslMarker
public class CfnDataSourceFormInputPropertyDsl {
    private val cdkBuilder: CfnDataSource.FormInputProperty.Builder =
        CfnDataSource.FormInputProperty.builder()

    /** @param content The content of the metadata form. */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /** @param formName The name of the metadata form. */
    public fun formName(formName: String) {
        cdkBuilder.formName(formName)
    }

    /** @param typeIdentifier The ID of the metadata form type. */
    public fun typeIdentifier(typeIdentifier: String) {
        cdkBuilder.typeIdentifier(typeIdentifier)
    }

    /** @param typeRevision The revision of the metadata form type. */
    public fun typeRevision(typeRevision: String) {
        cdkBuilder.typeRevision(typeRevision)
    }

    public fun build(): CfnDataSource.FormInputProperty = cdkBuilder.build()
}
