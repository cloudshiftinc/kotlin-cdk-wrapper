package io.cloudshiftdev.awscdk.services.qldb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLedger
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.qldb.CfnLedger,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** Specifies whether the ledger is protected from being deleted by any user. */
    public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    /** Specifies whether the ledger is protected from being deleted by any user. */
    public open fun deletionProtection(`value`: Boolean) {
        unwrap(this).setDeletionProtection(`value`)
    }

    /** Specifies whether the ledger is protected from being deleted by any user. */
    public open fun deletionProtection(`value`: IResolvable) {
        unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data at rest in
     * the ledger.
     */
    public open fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data at rest in
     * the ledger.
     */
    public open fun kmsKey(`value`: String) {
        unwrap(this).setKmsKey(`value`)
    }

    /** The name of the ledger that you want to create. */
    public open fun name(): String? = unwrap(this).getName()

    /** The name of the ledger that you want to create. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** The permissions mode to assign to the ledger that you want to create. */
    public open fun permissionsMode(): String = unwrap(this).getPermissionsMode()

    /** The permissions mode to assign to the ledger that you want to create. */
    public open fun permissionsMode(`value`: String) {
        unwrap(this).setPermissionsMode(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.qldb.CfnLedger]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies whether the ledger is protected from being deleted by any user.
         *
         * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
         *
         * If deletion protection is enabled, you must first disable it before you can delete the
         * ledger. You can disable it by calling the `UpdateLedger` operation to set this parameter
         * to `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
         *
         * @param deletionProtection Specifies whether the ledger is protected from being deleted by
         *   any user.
         */
        public fun deletionProtection(deletionProtection: Boolean)

        /**
         * Specifies whether the ledger is protected from being deleted by any user.
         *
         * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
         *
         * If deletion protection is enabled, you must first disable it before you can delete the
         * ledger. You can disable it by calling the `UpdateLedger` operation to set this parameter
         * to `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
         *
         * @param deletionProtection Specifies whether the ledger is protected from being deleted by
         *   any user.
         */
        public fun deletionProtection(deletionProtection: IResolvable)

        /**
         * The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data at rest
         * in the ledger.
         *
         * For more information, see
         * [Encryption at rest](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html)
         * in the *Amazon QLDB Developer Guide* .
         *
         * Use one of the following options to specify this parameter:
         * * `AWS_OWNED_KMS_KEY` : Use an AWS KMS key that is owned and managed by AWS on your
         *   behalf.
         * * *Undefined* : By default, use an AWS owned KMS key.
         * * *A valid symmetric customer managed KMS key* : Use the specified symmetric encryption
         *   KMS key in your account that you create, own, and manage.
         *
         * Amazon QLDB does not support asymmetric keys. For more information, see
         * [Using symmetric and asymmetric keys](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name
         * (ARN), alias name, or alias ARN. When using an alias name, prefix it with `"alias/"` . To
         * specify a key in a different AWS account , you must use the key ARN or alias ARN.
         *
         * For example:
         * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
         * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
         * * Alias name: `alias/ExampleAlias`
         * * Alias ARN: `arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias`
         *
         * For more information, see
         * [Key identifiers (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-kmskey)
         *
         * @param kmsKey The key in AWS Key Management Service ( AWS KMS ) to use for encryption of
         *   data at rest in the ledger.
         */
        public fun kmsKey(kmsKey: String)

        /**
         * The name of the ledger that you want to create.
         *
         * The name must be unique among all of the ledgers in your AWS account in the current
         * Region.
         *
         * Naming constraints for ledger names are defined in
         * [Quotas in Amazon QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming)
         * in the *Amazon QLDB Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-name)
         *
         * @param name The name of the ledger that you want to create.
         */
        public fun name(name: String)

        /**
         * The permissions mode to assign to the ledger that you want to create.
         *
         * This parameter can have one of the following values:
         * * `ALLOW_ALL` : A legacy permissions mode that enables access control with API-level
         *   granularity for ledgers.
         *
         * This mode allows users who have the `SendCommand` API permission for this ledger to run
         * all PartiQL commands (hence, `ALLOW_ALL` ) on any tables in the specified ledger. This
         * mode disregards any table-level or command-level IAM permissions policies that you create
         * for the ledger.
         * * `STANDARD` : ( *Recommended* ) A permissions mode that enables access control with
         *   finer granularity for ledgers, tables, and PartiQL commands.
         *
         * By default, this mode denies all user requests to run any PartiQL commands on any tables
         * in this ledger. To allow PartiQL commands to run, you must create IAM permissions
         * policies for specific table resources and PartiQL actions, in addition to the
         * `SendCommand` API permission for the ledger. For information, see
         * [Getting started with the standard permissions mode](https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html)
         * in the *Amazon QLDB Developer Guide* .
         *
         * We strongly recommend using the `STANDARD` permissions mode to maximize the security of
         * your ledger data.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-permissionsmode)
         *
         * @param permissionsMode The permissions mode to assign to the ledger that you want to
         *   create.
         */
        public fun permissionsMode(permissionsMode: String)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.qldb.CfnLedger.Builder =
            software.amazon.awscdk.services.qldb.CfnLedger.Builder.create(scope, id)

        /**
         * Specifies whether the ledger is protected from being deleted by any user.
         *
         * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
         *
         * If deletion protection is enabled, you must first disable it before you can delete the
         * ledger. You can disable it by calling the `UpdateLedger` operation to set this parameter
         * to `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
         *
         * @param deletionProtection Specifies whether the ledger is protected from being deleted by
         *   any user.
         */
        override fun deletionProtection(deletionProtection: Boolean) {
            cdkBuilder.deletionProtection(deletionProtection)
        }

        /**
         * Specifies whether the ledger is protected from being deleted by any user.
         *
         * If not defined during ledger creation, this feature is enabled ( `true` ) by default.
         *
         * If deletion protection is enabled, you must first disable it before you can delete the
         * ledger. You can disable it by calling the `UpdateLedger` operation to set this parameter
         * to `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-deletionprotection)
         *
         * @param deletionProtection Specifies whether the ledger is protected from being deleted by
         *   any user.
         */
        override fun deletionProtection(deletionProtection: IResolvable) {
            cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
        }

        /**
         * The key in AWS Key Management Service ( AWS KMS ) to use for encryption of data at rest
         * in the ledger.
         *
         * For more information, see
         * [Encryption at rest](https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html)
         * in the *Amazon QLDB Developer Guide* .
         *
         * Use one of the following options to specify this parameter:
         * * `AWS_OWNED_KMS_KEY` : Use an AWS KMS key that is owned and managed by AWS on your
         *   behalf.
         * * *Undefined* : By default, use an AWS owned KMS key.
         * * *A valid symmetric customer managed KMS key* : Use the specified symmetric encryption
         *   KMS key in your account that you create, own, and manage.
         *
         * Amazon QLDB does not support asymmetric keys. For more information, see
         * [Using symmetric and asymmetric keys](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name
         * (ARN), alias name, or alias ARN. When using an alias name, prefix it with `"alias/"` . To
         * specify a key in a different AWS account , you must use the key ARN or alias ARN.
         *
         * For example:
         * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
         * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
         * * Alias name: `alias/ExampleAlias`
         * * Alias ARN: `arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias`
         *
         * For more information, see
         * [Key identifiers (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id)
         * in the *AWS Key Management Service Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-kmskey)
         *
         * @param kmsKey The key in AWS Key Management Service ( AWS KMS ) to use for encryption of
         *   data at rest in the ledger.
         */
        override fun kmsKey(kmsKey: String) {
            cdkBuilder.kmsKey(kmsKey)
        }

        /**
         * The name of the ledger that you want to create.
         *
         * The name must be unique among all of the ledgers in your AWS account in the current
         * Region.
         *
         * Naming constraints for ledger names are defined in
         * [Quotas in Amazon QLDB](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming)
         * in the *Amazon QLDB Developer Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-name)
         *
         * @param name The name of the ledger that you want to create.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The permissions mode to assign to the ledger that you want to create.
         *
         * This parameter can have one of the following values:
         * * `ALLOW_ALL` : A legacy permissions mode that enables access control with API-level
         *   granularity for ledgers.
         *
         * This mode allows users who have the `SendCommand` API permission for this ledger to run
         * all PartiQL commands (hence, `ALLOW_ALL` ) on any tables in the specified ledger. This
         * mode disregards any table-level or command-level IAM permissions policies that you create
         * for the ledger.
         * * `STANDARD` : ( *Recommended* ) A permissions mode that enables access control with
         *   finer granularity for ledgers, tables, and PartiQL commands.
         *
         * By default, this mode denies all user requests to run any PartiQL commands on any tables
         * in this ledger. To allow PartiQL commands to run, you must create IAM permissions
         * policies for specific table resources and PartiQL actions, in addition to the
         * `SendCommand` API permission for the ledger. For information, see
         * [Getting started with the standard permissions mode](https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html)
         * in the *Amazon QLDB Developer Guide* .
         *
         * We strongly recommend using the `STANDARD` permissions mode to maximize the security of
         * your ledger data.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-permissionsmode)
         *
         * @param permissionsMode The permissions mode to assign to the ledger that you want to
         *   create.
         */
        override fun permissionsMode(permissionsMode: String) {
            cdkBuilder.permissionsMode(permissionsMode)
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qldb-ledger.html#cfn-qldb-ledger-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.qldb.CfnLedger = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLedger {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLedger(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.qldb.CfnLedger): CfnLedger =
            CfnLedger(cdkObject)

        internal fun unwrap(wrapped: CfnLedger): software.amazon.awscdk.services.qldb.CfnLedger =
            wrapped.cdkObject
    }
}
