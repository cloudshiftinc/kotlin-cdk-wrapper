@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Specifies restrictions for the batch build.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * BatchRestrictionsProperty batchRestrictionsProperty = BatchRestrictionsProperty.builder()
 * .computeTypesAllowed(List.of("computeTypesAllowed"))
 * .maximumBuildsAllowed(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html)
 */
@CdkDslMarker
public class CfnProjectBatchRestrictionsPropertyDsl {
    private val cdkBuilder: CfnProject.BatchRestrictionsProperty.Builder =
        CfnProject.BatchRestrictionsProperty.builder()

    private val _computeTypesAllowed: MutableList<String> = mutableListOf()

    /**
     * @param computeTypesAllowed An array of strings that specify the compute types that are allowed
     * for the batch build.
     * See [Build environment compute
   * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in
     * the *AWS CodeBuild User Guide* for these values.
     */
    public fun computeTypesAllowed(vararg computeTypesAllowed: String) {
        _computeTypesAllowed.addAll(listOf(*computeTypesAllowed))
    }

    /**
     * @param computeTypesAllowed An array of strings that specify the compute types that are allowed
     * for the batch build.
     * See [Build environment compute
   * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in
     * the *AWS CodeBuild User Guide* for these values.
     */
    public fun computeTypesAllowed(computeTypesAllowed: Collection<String>) {
        _computeTypesAllowed.addAll(computeTypesAllowed)
    }

    /**
     * @param maximumBuildsAllowed Specifies the maximum number of builds allowed.
     */
    public fun maximumBuildsAllowed(maximumBuildsAllowed: Number) {
        cdkBuilder.maximumBuildsAllowed(maximumBuildsAllowed)
    }

    public fun build(): CfnProject.BatchRestrictionsProperty {
        if (_computeTypesAllowed.isNotEmpty()) cdkBuilder.computeTypesAllowed(_computeTypesAllowed)
        return cdkBuilder.build()
    }
}
