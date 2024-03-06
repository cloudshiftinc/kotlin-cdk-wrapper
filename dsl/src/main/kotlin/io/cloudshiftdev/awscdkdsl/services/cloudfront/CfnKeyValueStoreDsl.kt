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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStore
import software.constructs.Construct

/**
 * The key value store.
 *
 * Use this to separate data from function code, allowing you to update data without having to
 * publish a new version of a function. The key value store holds keys and their corresponding
 * values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnKeyValueStore cfnKeyValueStore = CfnKeyValueStore.Builder.create(this, "MyCfnKeyValueStore")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .importSource(ImportSourceProperty.builder()
 * .sourceArn("sourceArn")
 * .sourceType("sourceType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html)
 */
@CdkDslMarker
public class CfnKeyValueStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyValueStore.Builder = CfnKeyValueStore.Builder.create(scope, id)

    /**
     * A comment for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-comment)
     *
     * @param comment A comment for the key value store.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     *
     * @param importSource The import source for the key value store.
     */
    public fun importSource(importSource: IResolvable) {
        cdkBuilder.importSource(importSource)
    }

    /**
     * The import source for the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-importsource)
     *
     * @param importSource The import source for the key value store.
     */
    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty) {
        cdkBuilder.importSource(importSource)
    }

    /**
     * The name of the key value store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keyvaluestore.html#cfn-cloudfront-keyvaluestore-name)
     *
     * @param name The name of the key value store.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnKeyValueStore = cdkBuilder.build()
}
