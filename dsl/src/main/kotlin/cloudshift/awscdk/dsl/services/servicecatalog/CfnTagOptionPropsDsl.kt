@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import kotlin.Boolean
import kotlin.String

/**
 * Properties for defining a `CfnTagOption`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnTagOptionProps cfnTagOptionProps = CfnTagOptionProps.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .active(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
 */
@CdkDslMarker
public class CfnTagOptionPropsDsl {
    private val cdkBuilder: CfnTagOptionProps.Builder = CfnTagOptionProps.builder()

    /**
     * @param active The TagOption active state.
     */
    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    /**
     * @param active The TagOption active state.
     */
    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    /**
     * @param key The TagOption key.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value The TagOption value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTagOptionProps = cdkBuilder.build()
}
