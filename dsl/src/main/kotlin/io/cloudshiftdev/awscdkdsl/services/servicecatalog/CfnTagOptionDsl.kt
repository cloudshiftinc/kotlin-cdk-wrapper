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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.constructs.Construct

/**
 * Specifies a TagOption.
 *
 * A TagOption is a key-value pair managed by AWS Service Catalog that serves as a template for
 * creating an AWS tag.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnTagOption cfnTagOption = CfnTagOption.Builder.create(this, "MyCfnTagOption")
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
public class CfnTagOptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTagOption.Builder = CfnTagOption.Builder.create(scope, id)

    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     *
     * @param active The TagOption active state.
     */
    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     *
     * @param active The TagOption active state.
     */
    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    /**
     * The TagOption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
     *
     * @param key The TagOption key.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * The TagOption value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
     *
     * @param value The TagOption value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTagOption = cdkBuilder.build()
}
