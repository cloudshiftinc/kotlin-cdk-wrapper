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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnCollaboration

/**
 * The settings for client-side encryption for cryptographic computing.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * DataEncryptionMetadataProperty dataEncryptionMetadataProperty =
 * DataEncryptionMetadataProperty.builder()
 * .allowCleartext(false)
 * .allowDuplicates(false)
 * .allowJoinsOnColumnsWithDifferentNames(false)
 * .preserveNulls(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-collaboration-dataencryptionmetadata.html)
 */
@CdkDslMarker
public class CfnCollaborationDataEncryptionMetadataPropertyDsl {
    private val cdkBuilder: CfnCollaboration.DataEncryptionMetadataProperty.Builder =
        CfnCollaboration.DataEncryptionMetadataProperty.builder()

    /**
     * @param allowCleartext Indicates whether encrypted tables can contain cleartext data ( `TRUE`
     *   ) or are to cryptographically process every column ( `FALSE` ).
     */
    public fun allowCleartext(allowCleartext: Boolean) {
        cdkBuilder.allowCleartext(allowCleartext)
    }

    /**
     * @param allowCleartext Indicates whether encrypted tables can contain cleartext data ( `TRUE`
     *   ) or are to cryptographically process every column ( `FALSE` ).
     */
    public fun allowCleartext(allowCleartext: IResolvable) {
        cdkBuilder.allowCleartext(allowCleartext)
    }

    /**
     * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries (
     *   `TRUE` ) or are to contain only non-repeated values ( `FALSE` ).
     */
    public fun allowDuplicates(allowDuplicates: Boolean) {
        cdkBuilder.allowDuplicates(allowDuplicates)
    }

    /**
     * @param allowDuplicates Indicates whether Fingerprint columns can contain duplicate entries (
     *   `TRUE` ) or are to contain only non-repeated values ( `FALSE` ).
     */
    public fun allowDuplicates(allowDuplicates: IResolvable) {
        cdkBuilder.allowDuplicates(allowDuplicates)
    }

    /**
     * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
     *   joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be
     *   joined on Fingerprint columns of the same name ( `FALSE` ).
     */
    public fun allowJoinsOnColumnsWithDifferentNames(
        allowJoinsOnColumnsWithDifferentNames: Boolean
    ) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames)
    }

    /**
     * @param allowJoinsOnColumnsWithDifferentNames Indicates whether Fingerprint columns can be
     *   joined on any other Fingerprint column with a different name ( `TRUE` ) or can only be
     *   joined on Fingerprint columns of the same name ( `FALSE` ).
     */
    public fun allowJoinsOnColumnsWithDifferentNames(
        allowJoinsOnColumnsWithDifferentNames: IResolvable
    ) {
        cdkBuilder.allowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames)
    }

    /**
     * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
     *   tables ( `TRUE` ) or cryptographically processed ( `FALSE` ).
     */
    public fun preserveNulls(preserveNulls: Boolean) {
        cdkBuilder.preserveNulls(preserveNulls)
    }

    /**
     * @param preserveNulls Indicates whether NULL values are to be copied as NULL to encrypted
     *   tables ( `TRUE` ) or cryptographically processed ( `FALSE` ).
     */
    public fun preserveNulls(preserveNulls: IResolvable) {
        cdkBuilder.preserveNulls(preserveNulls)
    }

    public fun build(): CfnCollaboration.DataEncryptionMetadataProperty = cdkBuilder.build()
}
