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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FormDataTypeConfig` property specifies the data type configuration for the data source
 * associated with a form.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FormDataTypeConfigProperty formDataTypeConfigProperty = FormDataTypeConfigProperty.builder()
 * .dataSourceType("dataSourceType")
 * .dataTypeName("dataTypeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-formdatatypeconfig.html)
 */
@CdkDslMarker
public class CfnFormFormDataTypeConfigPropertyDsl {
    private val cdkBuilder: CfnForm.FormDataTypeConfigProperty.Builder =
        CfnForm.FormDataTypeConfigProperty.builder()

    /**
     * @param dataSourceType The data source type, either an Amplify DataStore model or a custom
     *   data type.
     */
    public fun dataSourceType(dataSourceType: String) {
        cdkBuilder.dataSourceType(dataSourceType)
    }

    /**
     * @param dataTypeName The unique name of the data type you are using as the data source for the
     *   form.
     */
    public fun dataTypeName(dataTypeName: String) {
        cdkBuilder.dataTypeName(dataTypeName)
    }

    public fun build(): CfnForm.FormDataTypeConfigProperty = cdkBuilder.build()
}
