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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation

/**
 * Describes the data repository association's automatic import policy.
 *
 * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings up to
 * date by importing changes to your Amazon FSx for Lustre file system as you modify objects in a
 * linked S3 bucket.
 *
 * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
 * repository association.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * AutoImportPolicyProperty autoImportPolicyProperty = AutoImportPolicyProperty.builder()
 * .events(List.of("events"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoimportpolicy.html)
 */
@CdkDslMarker
public class CfnDataRepositoryAssociationAutoImportPolicyPropertyDsl {
    private val cdkBuilder: CfnDataRepositoryAssociation.AutoImportPolicyProperty.Builder =
        CfnDataRepositoryAssociation.AutoImportPolicyProperty.builder()

    private val _events: MutableList<String> = mutableListOf()

    /**
     * @param events The `AutoImportPolicy` can have the following event values:.
     * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
     *   that do not currently exist in the FSx file system.
     * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
     *   content on the file system as files change in the data repository.
     * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
     *   files are deleted in the data repository.
     *
     * You can define any combination of event types for your `AutoImportPolicy` .
     */
    public fun events(vararg events: String) {
        _events.addAll(listOf(*events))
    }

    /**
     * @param events The `AutoImportPolicy` can have the following event values:.
     * * `NEW` - Amazon FSx automatically imports metadata of files added to the linked S3 bucket
     *   that do not currently exist in the FSx file system.
     * * `CHANGED` - Amazon FSx automatically updates file metadata and invalidates existing file
     *   content on the file system as files change in the data repository.
     * * `DELETED` - Amazon FSx automatically deletes files on the file system as corresponding
     *   files are deleted in the data repository.
     *
     * You can define any combination of event types for your `AutoImportPolicy` .
     */
    public fun events(events: Collection<String>) {
        _events.addAll(events)
    }

    public fun build(): CfnDataRepositoryAssociation.AutoImportPolicyProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
