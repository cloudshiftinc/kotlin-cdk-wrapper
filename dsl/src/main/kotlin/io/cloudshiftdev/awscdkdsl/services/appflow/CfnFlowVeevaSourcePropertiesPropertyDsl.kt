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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when using Veeva as a flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * VeevaSourcePropertiesProperty veevaSourcePropertiesProperty =
 * VeevaSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .documentType("documentType")
 * .includeAllVersions(false)
 * .includeRenditions(false)
 * .includeSourceFiles(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-veevasourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowVeevaSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.VeevaSourcePropertiesProperty.Builder =
        CfnFlow.VeevaSourcePropertiesProperty.builder()

    /** @param documentType The document type specified in the Veeva document extract flow. */
    public fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
    }

    /**
     * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
     *   extract flow.
     */
    public fun includeAllVersions(includeAllVersions: Boolean) {
        cdkBuilder.includeAllVersions(includeAllVersions)
    }

    /**
     * @param includeAllVersions Boolean value to include All Versions of files in Veeva document
     *   extract flow.
     */
    public fun includeAllVersions(includeAllVersions: IResolvable) {
        cdkBuilder.includeAllVersions(includeAllVersions)
    }

    /**
     * @param includeRenditions Boolean value to include file renditions in Veeva document extract
     *   flow.
     */
    public fun includeRenditions(includeRenditions: Boolean) {
        cdkBuilder.includeRenditions(includeRenditions)
    }

    /**
     * @param includeRenditions Boolean value to include file renditions in Veeva document extract
     *   flow.
     */
    public fun includeRenditions(includeRenditions: IResolvable) {
        cdkBuilder.includeRenditions(includeRenditions)
    }

    /**
     * @param includeSourceFiles Boolean value to include source files in Veeva document extract
     *   flow.
     */
    public fun includeSourceFiles(includeSourceFiles: Boolean) {
        cdkBuilder.includeSourceFiles(includeSourceFiles)
    }

    /**
     * @param includeSourceFiles Boolean value to include source files in Veeva document extract
     *   flow.
     */
    public fun includeSourceFiles(includeSourceFiles: IResolvable) {
        cdkBuilder.includeSourceFiles(includeSourceFiles)
    }

    /** @param object The object specified in the Veeva flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnFlow.VeevaSourcePropertiesProperty = cdkBuilder.build()
}
