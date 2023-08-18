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

package io.cloudshiftdev.awscdkdsl.services.macie

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList

/**
 * Specifies the criteria for an allow list, which is a list that defines specific text or a text
 * pattern to ignore when inspecting data sources for sensitive data.
 *
 * The criteria can be:
 * * The location and name of an Amazon Simple Storage Service ( Amazon S3 ) object that lists
 *   specific, predefined text to ignore ( `S3WordsList` ), or
 * * A regular expression ( `Regex` ) that defines a text pattern to ignore.
 *
 * The criteria must specify either an S3 object or a regular expression. It can't specify both.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CriteriaProperty criteriaProperty = CriteriaProperty.builder()
 * .regex("regex")
 * .s3WordsList(S3WordsListProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-allowlist-criteria.html)
 */
@CdkDslMarker
public class CfnAllowListCriteriaPropertyDsl {
    private val cdkBuilder: CfnAllowList.CriteriaProperty.Builder =
        CfnAllowList.CriteriaProperty.builder()

    /**
     * @param regex The regular expression ( *regex* ) that defines the text pattern to ignore. The
     *   expression can contain 1-512 characters.
     */
    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    /**
     * @param s3WordsList The location and name of an Amazon S3 object that lists specific text to
     *   ignore.
     */
    public fun s3WordsList(s3WordsList: IResolvable) {
        cdkBuilder.s3WordsList(s3WordsList)
    }

    /**
     * @param s3WordsList The location and name of an Amazon S3 object that lists specific text to
     *   ignore.
     */
    public fun s3WordsList(s3WordsList: CfnAllowList.S3WordsListProperty) {
        cdkBuilder.s3WordsList(s3WordsList)
    }

    public fun build(): CfnAllowList.CriteriaProperty = cdkBuilder.build()
}
